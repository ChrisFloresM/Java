package com.cfloresh.almacen;

public class Frutas extends Producto {

    private double peso;
    private String color;

    public Frutas(String nombre, double precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\npeso: " + this.peso
                + "\ncolor: " + this.color;
    }
}
