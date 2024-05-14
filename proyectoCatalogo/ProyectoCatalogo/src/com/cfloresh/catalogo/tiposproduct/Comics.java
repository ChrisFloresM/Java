package com.cfloresh.catalogo.tiposproduct;

import java.time.LocalDate;
import java.util.Date;

public class Comics extends Libro {

    private String personaje;

    public Comics(int precio, LocalDate fechaPublicacion, String autor, String titulo,
                  String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {
        return precio*1.1;
    }

    @Override
    public String toString() {
        return "Producto: Comic " + "\n"
                + "Titulo: " + super.getTitulo() + "\n"
                + "Autor: " + super.getAuthor() + "\n"
                + "Editorial: " + super.getEditorial() + "\n"
                + "Fecha de publicacion: " + super.getFechaPublicacion() + "\n"
                + "Personaje: " + personaje + "\n"
                + "Precio: " + precio + "\n";
    }
}
