package com.cfloresh.sistemamamiferos.mamiferos;

abstract public class Felino extends Mamifero{

    protected float tamanioGarras;
    protected int velocidad;

    /* Constructor */

    public Felino(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, float tamanioGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanioGarras = tamanioGarras;
        this.velocidad = velocidad;
    }

    /* Getters */
    public float getTamanioGarras() {
        return tamanioGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
