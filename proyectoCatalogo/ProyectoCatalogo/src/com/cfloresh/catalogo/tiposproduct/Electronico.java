package com.cfloresh.catalogo.tiposproduct;

import com.cfloresh.catalogo.interfaces.IElectronico;

abstract public class Electronico extends Producto implements IElectronico {

    protected String fabricante;

    public Electronico(String fabricante, int precio) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }
}
