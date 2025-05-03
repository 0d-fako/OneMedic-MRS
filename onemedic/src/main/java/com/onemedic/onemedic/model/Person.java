package com.onemedic.onemedic.model;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Person {
    private final UUID id;
    private final String name;


    public Person(UUID id, String name) {
        this.id = id;
        this.name = name;

    }


}
