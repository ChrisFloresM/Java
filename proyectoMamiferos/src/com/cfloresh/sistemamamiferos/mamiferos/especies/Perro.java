package com.cfloresh.sistemamamiferos.mamiferos.especies;

import com.cfloresh.sistemamamiferos.mamiferos.Canino;

public class Perro extends Canino {

    private Integer fuerzaMordida;

    public Perro(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, float tamanioColmillos,
                 Integer fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro de nombre cientifico " + this.nombreCientifico
                + " se alimenta con una mordida de " + this.fuerzaMordida + " psi's";
    }

    @Override
    public String dormir() {
        return "El perro de nombre cientifico " + this.nombreCientifico
                + " duerme en su habitat: " + this.habitat;
    }

    @Override
    public String correr() {
        return "El perro: " + this.nombreCientifico
                + " de color " + this.color
                + "corre por las noches en " + this.habitat;
    }

    @Override
    public String comunicarse() {
        return "El perro: " + this.nombreCientifico
                + " de color " + this.color
                + " se comunica con su manada para cazar";
    }
}
