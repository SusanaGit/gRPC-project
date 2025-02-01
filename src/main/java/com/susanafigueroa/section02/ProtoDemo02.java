package com.susanafigueroa.section02;

import com.susanafigueroa.models.section02.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProtoDemo02 {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProtoDemo02.class);

    public static void main(String[] args) {

        // compare
        Person person1 = createPerson();
        Person person2 = createPerson();
        LOGGER.info("equals {}", person1.equals(person2));
        LOGGER.info(" == {} ", (person1 == person2));

        // create new person using another person object
        Person person3 = person1.toBuilder()
                .setName("marc")
                .setAge(10)
                .build();
        LOGGER.info("{}", person3);

        // null?
        Person person4 = person1.toBuilder().clearAge().build();
        LOGGER.info("person4: {}", person4);

    }

    private static Person createPerson() {
        return Person.newBuilder()
                .setName("pol")
                .setAge(20)
                .build();
    }
}
