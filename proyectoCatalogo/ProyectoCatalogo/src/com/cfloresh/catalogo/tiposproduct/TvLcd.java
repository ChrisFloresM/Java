package com.cfloresh.catalogo.tiposproduct;

public class TvLcd extends Electronico{
    private int pulgada;

    public TvLcd(String fabricante, int precio, int pulgada) {
        super(fabricante, precio);
        this.pulgada = pulgada;

    }

    public int getPulgada() {
        return pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return precio * 2.2;
    }

    @Override
    public String toString() {
        return "Producto: Tv-LCD " + "\n"
                + "Fabricante: " + fabricante + "\n"
                + "Pulgadas: " + pulgada + "\n"
                + "Precio: " + precio + "\n";
    }
}
