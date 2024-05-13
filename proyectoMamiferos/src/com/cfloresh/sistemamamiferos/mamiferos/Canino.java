package com.cfloresh.sistemamamiferos.mamiferos;

abstract public class Canino extends Mamifero{
    protected String color;
    protected float tamanioColmillos;

    public Canino(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, float tamanioColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanioColmillos = tamanioColmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamanioColmillos() {
        return tamanioColmillos;
    }

}
