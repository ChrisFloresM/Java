package com.cfloresh.sistemamamiferos.mamiferos.especies;

import com.cfloresh.sistemamamiferos.mamiferos.Felino;

public class Leon extends Felino {

    private Integer numeroManada;
    private Float potenciaRugidoDecibel;

    public Leon(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, float tamanioGarras, int velocidad,
                Integer numeroManda, Float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.numeroManada = numeroManda;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El leon " + this.nombreCientifico
                + " se alimenta con su mananda de " + this.numeroManada
                + " y ruge con un rugido de " + this.potenciaRugidoDecibel
                + " decibeles";
    }

    @Override
    public String dormir() {
        return "El leon " + this.nombreCientifico
                + " duerme en su habitat: " + this.habitat;
    }

    @Override
    public String correr() {
        return "El leon " + this.nombreCientifico
                + " corre a una velocidad de " + this.velocidad
                + " km/h";
    }

    @Override
    public String comunicarse() {
        return "El leon " + this.nombreCientifico
                + " se comunica con su manada de " + this.numeroManada
                + " rugiendo con " + this.potenciaRugidoDecibel
                + " decibeles";
    }
}
