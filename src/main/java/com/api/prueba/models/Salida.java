package com.api.prueba.models;



public class Salida {
    public int getLengthCadena() {
        return lengthCadena;
    }

    public void setLengthCadena(int lengthCadena) {
        this.lengthCadena = lengthCadena;
    }

    public int getIsPalindromo() {
        return isPalindromo;
    }

    public void setIsPalindromo(int isPalindromo) {
        this.isPalindromo = isPalindromo;
    }

    public int getLengthCaracteresEspeciales() {
        return lengthCaracteresEspeciales;
    }

    public void setLengthCaracteresEspeciales(int lengthCaracteresEspeciales) {
        this.lengthCaracteresEspeciales = lengthCaracteresEspeciales;
    }

    private int lengthCadena;
    private int isPalindromo;
    private int lengthCaracteresEspeciales;
}
