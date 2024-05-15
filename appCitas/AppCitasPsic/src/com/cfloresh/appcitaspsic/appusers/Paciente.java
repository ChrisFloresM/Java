package com.cfloresh.appcitaspsic.appusers;

import com.cfloresh.appcitaspsic.enums.RazonConsulta;

import java.util.Scanner;

public class Paciente extends Usuario{

    RazonConsulta razonDeConsulta;
    Psicologo psicologoAsignado;

    public Paciente(String nombre, String apellido, String localidad, int edad) {
        super(nombre, apellido, localidad, edad);
    }

    public void setRazonDeConsulta(RazonConsulta razonDeConsulta) {
        this.razonDeConsulta = razonDeConsulta;
    }

    public void setPsicologoAsignado(Psicologo psicologoAsignado) {
        this.psicologoAsignado = psicologoAsignado;
    }

    public RazonConsulta getRazonDeConsulta() {
        return razonDeConsulta;
    }

    public Psicologo getPsicologoAsignado() {
        return psicologoAsignado;
    }

    @Override
    public void modificarDatos() {
        Scanner scan = new Scanner(System.in);

        /* Mostrar menú de opciones al usuario */
        StringBuilder menusb = new StringBuilder();

        menusb.append("Que datos desea modificar: ");
        menusb.append("\n1. Nombre");
        menusb.append("\n2. Apellido");
        menusb.append("\n3. Edad");
        menusb.append("\n4. Localidad");

        switch(scan.nextInt()){
            case 1 -> {
                System.out.println("Ingrese nuevo nombre: ");
                this.nombre = scan.nextLine();
            }

            case 2 -> {
                System.out.println("Ingrese nuevo apellido: ");
                this.apellido = scan.nextLine();
            }

            case 3 -> {
                System.out.println("Ingrese nueva edad: ");
                this.edad = scan.nextInt();
            }

            case 4 -> {
                System.out.println("Ingrese nueva Localidad: ");
                this.localidad = scan.nextLine();
            }
        }

        System.out.println("Valor actualizado con exito");
    }

    @Override
    public String toString() {
        return "\nNombre: " + this.nombre + " " + this.apellido
                + "\nLocalidad: " + this.localidad
                + "\nRazon de la consulta: " + this.razonDeConsulta;
    }
}
