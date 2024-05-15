package com.cfloresh.appcitaspsic.appusers;

import com.cfloresh.appcitaspsic.enums.*;

public class Psicologo extends Usuario {

    Enfoque enfoque;
    RazonConsulta areasDeExp;

    public Psicologo(String nombre, String apellido, String localidad, int edad) {
        super(nombre, apellido, localidad, edad);
    }

    public void setEnfoque(Enfoque enfoque) {
        this.enfoque = enfoque;
    }

    public void setAreasDeExp(RazonConsulta areasDeExp) {
        this.areasDeExp = areasDeExp;
    }

    public Enfoque getEnfoque() {
        return enfoque;
    }

    public RazonConsulta getAreasDeExp() {
        return areasDeExp;
    }

    @Override
    public void modificarDatos() {

    }

    @Override
    public String toString() {
        return "\nNombre: " + this.nombre + " " + this.apellido
                + "\nLocalidad: " + this.localidad
                + "\nEnfoque: " + this.enfoque.getTextValue()
                + "\nAreas de experiencia: " + this.areasDeExp.getTextValue();
    }
}
