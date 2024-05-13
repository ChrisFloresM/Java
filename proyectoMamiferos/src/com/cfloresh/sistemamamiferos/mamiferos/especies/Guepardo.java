package com.cfloresh.sistemamamiferos.mamiferos.especies;

import com.cfloresh.sistemamamiferos.mamiferos.Felino;

public class Guepardo extends Felino {

    public Guepardo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, float tamanioGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo se alimenta con sus garras de " + tamanioGarras + " cm";
    }

    @Override
    public String dormir() {
        return "El guepardo duerme por las noches en su habitat " + habitat;
    }

    @Override
    public String correr() {
        return "El guepardo corre para cazar a sus presas a una velocidad de " + velocidad + " km/h";
    }

    @Override
    public String comunicarse() {
        return "El guepardo se comunica con los suyos en su habitat " + habitat;
    }
}
