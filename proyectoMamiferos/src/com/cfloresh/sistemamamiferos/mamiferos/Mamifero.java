package com.cfloresh.sistemamamiferos.mamiferos;

abstract public class Mamifero {

    /* Atributos (Instance Fields) */
    protected String habitat;
    protected Float altura;
    protected Float largo;
    protected Float peso;
    protected String nombreCientifico;

    /* Constructor */

    public Mamifero(String habitat, Float altura, Float largo, Float peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    /* Getters */
    public String getHabitat() {
        return habitat;
    }

    public Float getAltura() {
        return altura;
    }

    public Float getLargo() {
        return largo;
    }

    public Float getPeso() {
        return peso;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    /* Métodos abstractos */
    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String comunicarse();
}
