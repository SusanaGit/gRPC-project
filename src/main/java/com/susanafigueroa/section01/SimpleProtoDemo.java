package com.susanafigueroa.section01;

import com.susanafigueroa.models.PersonOuterClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleProtoDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleProtoDemo.class);

    public static void main(String[] args) {

        var person = PersonOuterClass.Person.newBuilder()
                                            .setName("susana")
                                            .setAge(11)
                                            .build();

        LOGGER.info("{}" , person);
    }

}
