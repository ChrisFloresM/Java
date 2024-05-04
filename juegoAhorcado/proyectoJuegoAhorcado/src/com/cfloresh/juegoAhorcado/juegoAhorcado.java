package com.cfloresh.juegoAhorcado;

import java.util.Scanner;

public class juegoAhorcado {

    private static final int MAX_NUM_PISTAS = 3;

    /* Instance field declarations */
    private Jugador jugador;
    private String textoEnJuego;
    private String estatusJuego;
    private String[] pistas;
    private boolean jugadorHaGanado = false;

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugadorHaGanado(boolean jugadorHaGanado) {
        this.jugadorHaGanado = jugadorHaGanado;
    }
    /* Methods declarations */

    public void inicializarJuego(){
        Scanner in = new Scanner(System.in);
        this.jugador = new Jugador();
        pistas = new String[MAX_NUM_PISTAS];

        System.out.print("\nIngrese el nombre del jugador: ");
        this.jugador.setNombre(in.nextLine());

        System.out.print("\nIngrese el texto con el cual jugar: ");
        this.textoEnJuego = in.nextLine();

        System.out.println("\nIngrese las 3 pistas: ");
        for(int i = 0; i < MAX_NUM_PISTAS; i++) {
            System.out.print("Ingrese pista " + i+1 + ": ");
            this.pistas[i] = in.nextLine();
        }

        //in.close();

        StringBuilder estatusJuegoBd = new StringBuilder();

        for(int i = 0; i < this.textoEnJuego.length(); i++){
            if(this.textoEnJuego.charAt(i) != ' ') {
                estatusJuegoBd.append("_");
            } else {
                estatusJuegoBd.append(" ");
            }
        }

        this.estatusJuego = estatusJuegoBd.toString();
    }

    public void mostrarEstatus(){
        System.out.println("\nJuego actual: ");
        System.out.println(this.estatusJuego);
        System.out.println("\nIntentos disponibles: ");
        System.out.println(Jugador.getNumeroIntentos());
        System.out.println("\nPistas disponibles: ");
        System.out.println(Jugador.getNumeroPistas());
    }

    public boolean buscarYReemplazar(char letraIntento){
        int letraIndex = this.textoEnJuego.indexOf(letraIntento);

        if(letraIndex < 0) return false;

        char[] textoEnJuegoCharArr = this.textoEnJuego.toCharArray();
        char[] estatusJuegoCharArr = this.estatusJuego.toCharArray();

        for(int i = 0; i < textoEnJuegoCharArr.length; i++) {
            if(textoEnJuegoCharArr[i] == letraIntento) {
                estatusJuegoCharArr[i] = letraIntento;
            }
        }

        this.estatusJuego = new String(estatusJuegoCharArr);
        return true;
    }

    public boolean evaluarProgreso(){
        this.jugadorHaGanado = this.estatusJuego.equalsIgnoreCase(this.textoEnJuego);
        return jugadorHaGanado;
    }

    public void darPista(){
        if(jugador.consumirPista())
            System.out.println("\n" + this.pistas[Jugador.getNumeroPistas()-1]);
        else
            System.out.println("\n" + "Ya no hay pistas disponibles :( ");
    }

    public int mostrarMenu(){
        Scanner in = new Scanner(System.in);
        /* Final instance fields declaratios */
        String menuDeAcciones = "\n***************** Acciones *****************" +
                "\n1. Intentar una letra " +
                "\n2. Solicitar una pista " +
                "\n3. Finalizar juego " +
                "\nSeleccione una opcion: ";
        System.out.print(menuDeAcciones);

        return in.nextInt();
    }

    public void finalizarJuego(){
        if(jugadorHaGanado) {
            System.out.println("\nFelicitaciones " + this.jugador.getNombre());
            System.out.println("Has GANADO!");
        } else {
            System.out.println("\nLo siento " + this.jugador.getNombre());
            System.out.println("Has PERDIDO");
            System.out.println("La respuesta era: " + this.textoEnJuego);
        }

    }


}
