package com.cfloresh.appcitaspsic.menus;

import com.cfloresh.appcitaspsic.repo.RepoPacientes;
import com.cfloresh.appcitaspsic.repo.RepoPsic;

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
    public void realizarAccion(int accion, RepoPacientes pacientes, RepoPsic psicologos) {

        switch(accion) {
            case 1 -> {
                MenuNuevoUsuario menuNuevoUsuario = new MenuNuevoUsuario("¿Es un psicólogo o un paciente? ");
                menuNuevoUsuario.realizarAccion(menuNuevoUsuario.mostrarMenu(), pacientes, psicologos);
            }
            case 2 -> System.out.println("Usted seleccionó: Usuario existente");
            case 3 -> {

                System.out.println("\nPacientes:");
                pacientes.getPacientes().forEach(System.out::println);

                System.out.println("\nPsicologos:");
                psicologos.getPsicologos().forEach(System.out::println);

                System.exit(0);
            }
        }
   }

}
