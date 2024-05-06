package com.cfloresh.almacen;

public class NoPerecible extends Producto {

    private int contenido;
    private int calorias;

    public NoPerecible(String nombre, double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    @Override
    public String toString() {
        return super.toString() + "\nContenido: " + this.contenido
                + "\nCalorias: " + this.calorias;
    }
}
