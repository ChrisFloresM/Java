package com.cfloresh.proyectofacturas.models;

public class Cliente {
    private String nombre;
    private String nif;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre +
                "\n" +
                "NIF: " + nif;
    }
}
