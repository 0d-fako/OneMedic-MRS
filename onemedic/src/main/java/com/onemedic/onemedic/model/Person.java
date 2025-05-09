package com.onemedic.onemedic.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;

import java.util.UUID;


public class Person {
    private final UUID id;

    @NotNull
    private final String name;


    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;

    }
    public String getName(){
        return name;
    }

    public Object getId() {
        return id;
    }
}
