package com.cfloresh.catalogo;

import com.cfloresh.catalogo.tiposproduct.*;
import java.time.LocalDate;

public class PruebaCatalogo {
    public static void main(String[] args) {

        Producto[] productos = new Producto[6];

        productos[0] = new IPhone("Apple", 18999, "Azul celeste", "Pro Max");
        productos[1] = new TvLcd("Samsung", 5999, 15);
        productos[2] = new Libro(350, LocalDate.of(2012, 6, 23), "Luis Monroe",
                "En busca de nuevos horizontes", "Montecarlo");
        productos[3] = new Comics(79, LocalDate.of(1996, 5, 12), "Stan Lee",
                "The Amazing Spiderman", "Marvel", "Spiderman");
        productos[4] = new IPhone("Apple", 29499, "Verde", "Pro Max V2");
        productos[5] = new Comics(120, LocalDate.of(1939, 3, 30), "Bob Kane",
                "Detective Batman", "DCComics", "Batman");

        System.out.println("Lista de productos: \n");
        for(Producto p : productos) {
            System.out.println(p.toString() + "\n" + "Precio venta: " + p.getPrecioVenta() + "\n");
            System.out.println("----------------------------------------------------------");
        }
    }
}
