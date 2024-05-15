package com.cfloresh.appcitaspsic.menus;

import com.cfloresh.appcitaspsic.appusers.Paciente;
import com.cfloresh.appcitaspsic.appusers.Psicologo;
import com.cfloresh.appcitaspsic.appusers.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

abstract public class Menu implements RealizarAccion{

    protected String mensajePrincipal;
    protected String mensajeOpciones;

    protected int minMenuValue;
    protected int maxMenuValue;

    public int mostrarMenu() {
        Scanner scan = new Scanner(System.in);
        int userInput;

        System.out.println("\n***********  " + mensajePrincipal + "  ***********");

        do {
            System.out.print(mensajeOpciones);
            userInput = scan.nextInt();
            if(userInput < minMenuValue || userInput > maxMenuValue) {
                System.out.println("\nERROR: Ingrese una opción válida\n");
            }
        } while(userInput < minMenuValue || userInput > maxMenuValue);

        return userInput;
    }

    public void realizarAccion(int accion, ArrayList<Paciente> pacientes, ArrayList<Psicologo> psicologos){
        System.out.println("Default menu action");
    }

    public void realizarAccion(int accion, ArrayList<Usuario> users) {
        System.out.println("Default menu action");
    }

    public void realizarAccion(int accion, Usuario user) {
        System.out.println("Default menu action");
    }

}
