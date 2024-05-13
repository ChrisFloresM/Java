package com.cfloresh.sistemamamiferos.mamiferos.especies;

import com.cfloresh.sistemamamiferos.mamiferos.Felino;

public class Tigre extends Felino {
    private String especie;

    public Tigre(String habitat, Float altura, Float largo, Float peso, String nombreCientifico,
                 float tamanioGarras, int velocidad, String especie) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.especie = especie;
    }


    @Override
    public String comer() {
        return "El tigre de especie " + this.especie + " (" + this.nombreCientifico + ") "
                + "caza su comida para mantener su peso de " + this.peso + " kg";
    }

    @Override
    public String dormir() {
        return "El tigre de especie " + this.especie + " (" + this.nombreCientifico + ") "
                + "duerme en su habitat: " + this.habitat;
    }

    @Override
    public String correr() {
        return "El tigre de especie " + this.especie + " (" + this.nombreCientifico + ") "
                + "corre a una velocidad de " + this.velocidad + " km/h";
    }

    @Override
    public String comunicarse() {
        return "El tigre de especie " + this.especie + " (" + this.nombreCientifico + ") "
                + "se comunica con otros ejemplares";
    }
}
