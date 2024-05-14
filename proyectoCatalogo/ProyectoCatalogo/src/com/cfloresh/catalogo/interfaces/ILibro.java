package com.cfloresh.catalogo.interfaces;
import java.time.LocalDate;

public interface ILibro {
    LocalDate getFechaPublicacion();

    String getAuthor();
    String getTitulo();
    String getEditorial();
}
