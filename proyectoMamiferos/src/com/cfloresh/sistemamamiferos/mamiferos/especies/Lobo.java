package com.cfloresh.sistemamamiferos.mamiferos.especies;
import com.cfloresh.sistemamamiferos.mamiferos.Canino;


public class Lobo extends Canino {

    private Integer numCamada;
    private String especieLobo;

    public Lobo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, float tamanioColmillos,
                Integer numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo de especie " + this.especieLobo + " se alimenta con su camada de "
                + this.numCamada + " miembros, con sus colmillos de " + this.tamanioColmillos + " cm";
    }

    @Override
    public String dormir() {
        return "El lobo de especie " + this.especieLobo + "duerme en su habitat: " + this.habitat;
    }

    @Override
    public String correr() {
        return "El lobo de especie " + this.especieLobo
                + "corre en su hábitat: " + this.habitat;
    }

    @Override
    public String comunicarse() {
        return "El lobo de especie " + this.especieLobo
                + " se comunica con su manada de " + this.numCamada
                + " miembros";
    }
}
