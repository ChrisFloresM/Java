package com.cfloresh.appcitaspsic.enums;

public enum Enfoque {
    COGNITIVO_CONDUCTUAL("Cognitivo conductual"),
    PSICOANALISIS("Psicoanalisis"),
    SISTEMATICO("Sistematico");

    private String textValue;

    Enfoque(String textValue) {
        this.textValue = textValue;
    }

    public String getTextValue() {
        return textValue;
    }
}
