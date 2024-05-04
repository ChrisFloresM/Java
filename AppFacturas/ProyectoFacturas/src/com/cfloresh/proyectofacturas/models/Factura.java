package com.cfloresh.proyectofacturas.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;

    public static final int MAX_ITEMS = 10;

    private static int ultimoFolio;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }

    /* Getters and Setters */
    public ItemFactura[] getItems() {
        return items;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /* Methods */
    public void addItemFactura(ItemFactura item) {
        if(indiceItems < MAX_ITEMS)
            this.items[indiceItems++] = item;
    }

    public float calcularTotal() {
        float total = 0.0f;
        for(int i = 0; i < indiceItems; i++) {
            total += this.items[i].calcularImporte();
        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura N°: ");
        sb.append(folio)
                .append("\n")
                .append(cliente)
                .append("\nDescripcion: ")
                .append(this.descripcion)
                .append("\n");
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha de emisión: ")
                .append(df.format(this.fecha))
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        for(int i = 0; i < indiceItems; i++) {
            sb.append(this.items[i].toString())
                    .append("\n");
        }

        sb.append("\nGran total: ")
                .append(calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}
