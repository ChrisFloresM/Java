package com.cfloresh.appcitaspsic.menus;

import com.cfloresh.appcitaspsic.appusers.Paciente;
import com.cfloresh.appcitaspsic.appusers.Psicologo;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuInicio extends Menu{

    public MenuInicio(String mensajePrincial){

        minMenuValue = 1;
        maxMenuValue = 3;

        this.mensajePrincipal = mensajePrincial;
        StringBuilder opmsg = new StringBuilder("1. Nuevo Usuario\n")
                .append("2. Usuario existente\n")
                .append("3. Salir\n")
                .append("Seleccione una opción: ");
        mensajeOpciones = opmsg.toString();
    }

    @Override
    public void realizarAccion(int accion, ArrayList<Paciente> pacientes, ArrayList<Psicologo> psicologos) {

        switch(accion) {
            case 1 -> {
                MenuNuevoUsuario menuNuevoUsuario = new MenuNuevoUsuario("¿Es un psicólogo o un paciente? ");
                menuNuevoUsuario.realizarAccion(menuNuevoUsuario.mostrarMenu(), pacientes, psicologos);
            }  // Preguntar si es un psicólogo o un paciente;
            case 2 -> System.out.println("Usted seleccionó: Usuario existente");
            case 3 -> {
                pacientes.forEach(System.out::println);
                psicologos.forEach(System.out::println);
                System.exit(0);
            }
        }
   }

}
