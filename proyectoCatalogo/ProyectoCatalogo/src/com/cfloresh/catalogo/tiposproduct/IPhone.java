package com.cfloresh.catalogo.tiposproduct;

import com.cfloresh.catalogo.interfaces.IProducto;

public class IPhone extends Electronico {

    private String color;
    private String modelo;

    public IPhone(String fabricante, int precio, String color, String modelo) {
        super(fabricante, precio);
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public double getPrecioVenta() {
        return precio*1.4;
    }

    @Override
    public String toString() {
        return "Producto: iPhone " + "\n"
                + "Fabricante: " + fabricante + "\n"
                + "Color: " + color + "\n"
                + "Modelo: " + modelo + "\n"
                + "Precio: " + precio + "\n";
    }
}
