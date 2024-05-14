package com.cfloresh.appcitaspsic.enums;

public enum RazonConsulta {

    ANSIEDAD("Ansiedad"),
    ESTRES("Estres"),
    DEPRESION("Depresion"),
    PROBLEMAS_FAMILIARES("Problemas familiares"),
    PROBLEMAS_DE_PAREJA("Problemas de pareja"),
    PROBLEMAS_LABORALES("Problemas laborales");

    private String textValue;

    RazonConsulta(String textValue) {
        this.textValue = textValue;
    }

    public String getTextValue() {
        return textValue;
    }
}
