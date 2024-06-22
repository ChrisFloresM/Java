package com.cfloresh.appcitaspsic.menus;

import com.cfloresh.appcitaspsic.repo.RepoPacientes;
import com.cfloresh.appcitaspsic.repo.RepoPsic;

public class MenuNuevoUsuario extends Menu {

    public MenuNuevoUsuario(String mensajePrincial){

        minMenuValue = 1;
        maxMenuValue = 2;

        this.mensajePrincipal = mensajePrincial;
        StringBuilder opmsg = new StringBuilder("1. Piscólogo\n")
                .append("2. Paciente\n")
                .append("Seleccione una opción: ");
        mensajeOpciones = opmsg.toString();
    }

    @Override
    public void realizarAccion(int accion, RepoPacientes pacientes, RepoPsic psicologos) {

        switch(accion) {
            case 1 -> {
                System.out.println("Usted seleccionó: Nuevo psicólogo");
                psicologos.crear(psicologos.inputUserData());
                System.out.println("\nPsicologo añadido con éxito\n");
            }

            case 2 -> {
                System.out.println("Usted seleccionó: Nuevo Paciente");
                pacientes.crear(pacientes.inputUserData());
                System.out.println("\nPaciente añadido con éxito\n");
            }
        }
    }

}
