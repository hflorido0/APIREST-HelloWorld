package com.example.apirest.model;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Friend {
    @JsonProperty("nombre")
    private String name;

    @JsonProperty("apellido")
    private String surname;

    @JsonCreator
    public Friend(@JsonProperty("nombre") String name,
                  @JsonProperty("apellido") String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}