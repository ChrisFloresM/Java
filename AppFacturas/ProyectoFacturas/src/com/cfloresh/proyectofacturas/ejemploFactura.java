package com.cfloresh.proyectofacturas;

import com.cfloresh.proyectofacturas.models.*;

import java.util.Scanner;

public class ejemploFactura {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("0616-17");
        cliente.setNombre("Christian");

        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese descripcion de la factura: ");

        Factura miFactura = new Factura(in.nextLine(), cliente);

        Producto producto;

        for(int i = 0; i < 2; i++) {
            producto = new Producto();

            System.out.print("Ingrese nombre del producto " + producto.getCodigo() + ": ");
            producto.setNombre(in.next());

            System.out.print("Ingrese el precio del producto: ");
            producto.setPrecio(in.nextFloat());

            System.out.print("Ingrese cantidad del producto: ");

            miFactura.addItemFactura(new ItemFactura(producto, in.nextInt()));

            System.out.println();
        }

        System.out.println(miFactura);
    }
}
