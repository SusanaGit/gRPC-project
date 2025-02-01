package com.susanafigueroa.section03;

import com.susanafigueroa.models.section03.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Serialization {

    private static final Logger LOGGER = LoggerFactory.getLogger(Serialization.class);
    private static final Path PATH = Path.of("person.out");

    public static void main(String[] args) {

        Person person = Person.newBuilder()
                .setName("sam")
                .setAge(10)
                .setEmail("hola@hola.com")
                .setEmployed(true)
                .setSalary(1000)
                .setBankAccountNumber(12394123L)
                .setBalance(-10)
                .build();

        serialize(person);
        LOGGER.info("{}", deserialize());
        LOGGER.info("equals: {}", person.equals(deserialize()));

    }

    public static void serialize(Person person) {
        try {
            person.writeTo(Files.newOutputStream(PATH));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Person deserialize() {
        try {
            return Person.parseFrom(Files.newInputStream(PATH));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
