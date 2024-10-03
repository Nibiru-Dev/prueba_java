package com.api.prueba.models;

import lombok.Getter;
import lombok.Setter;


public class Entrada {
    public String getPalindromo() {
        return palindromo;
    }

    public void setPalindromo(String palindromo) {
        this.palindromo = palindromo;
    }

    private String palindromo;
}
