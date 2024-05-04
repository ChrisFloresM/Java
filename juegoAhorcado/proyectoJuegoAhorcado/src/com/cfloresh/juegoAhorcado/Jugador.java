package com.cfloresh.juegoAhorcado;

import java.util.Scanner;

public class Jugador {

    /* Final elements declarations */
    private static final int MAX_INTENTOS = 6;
    private static final int MAX_PISTAS = 3;

    /* Instance fields declarations */
    private String nombre;
    private static int numeroIntentos = MAX_INTENTOS;
    private static int numeroPistas = 0;

    /* Getters and Setters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getNumeroIntentos() {
        return numeroIntentos;
    }

    public static int getNumeroPistas() {
        return numeroPistas;
    }

    /* Methods declarations */
    public char intentarLetra() {
        char intento;
        Scanner in = new Scanner(System.in);

        do{
            System.out.print("\nIngrese una letra a intentar: ");
            intento = in.next().charAt(0);

            if(!Character.isAlphabetic(intento)) {
                System.out.println("\nCaracter no válido. Ingrese una letra");
            }
        } while(!Character.isAlphabetic(intento));

        return intento;
    }

    public boolean disminuirIntentos() {
        return --numeroIntentos != 0;
    }

    public boolean consumirPista() {
        return ++numeroPistas <= MAX_PISTAS;
    }



}
