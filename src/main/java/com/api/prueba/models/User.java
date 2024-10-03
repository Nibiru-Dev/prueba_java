package com.api.prueba.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//Modelo para mapear los datos de formato JSON
public class User {
    private Long id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;
}
