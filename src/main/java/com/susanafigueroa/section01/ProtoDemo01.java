package com.susanafigueroa.section01;

import com.susanafigueroa.models.section01.PersonOuterClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProtoDemo01 {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProtoDemo01.class);

    public static void main(String[] args) {

        var person01 = PersonOuterClass.Person.newBuilder()
                                            .setName("susana")
                                            .setAge(11)
                                            .build();

        LOGGER.info("{}" , person01);
    }

}
