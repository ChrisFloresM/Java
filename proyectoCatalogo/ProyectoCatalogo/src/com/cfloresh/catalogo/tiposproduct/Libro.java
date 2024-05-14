package com.cfloresh.catalogo.tiposproduct;

import com.cfloresh.catalogo.interfaces.ILibro;

import java.time.LocalDate;

public class Libro extends Producto implements ILibro {

    private LocalDate fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, LocalDate fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public double getPrecioVenta() {
        return precio*1.23;
    }

    @Override
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String getAuthor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        return "Producto: Libro " + "\n"
                + "Titulo: " + this.getTitulo() + "\n"
                + "Autor: " + this.getAuthor() + "\n"
                + "Fecha de publicacion: " + fechaPublicacion + "\n"
                + "Editorial: " + this.getEditorial() + "\n"
                + "Precio: " + precio + "\n";
    }
}
