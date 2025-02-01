package com.susanafigueroa.section02;

import com.susanafigueroa.models.section02.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProtoDemo02 {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProtoDemo02.class);

    public static void main(String[] args) {

        var person02 = Person.newBuilder()
                .setName("pol")
                .setAge(20)
                .build();

        LOGGER.info("{}", person02);

    }

}
