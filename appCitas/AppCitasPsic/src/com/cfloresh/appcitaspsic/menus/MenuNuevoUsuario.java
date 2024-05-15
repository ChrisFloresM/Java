package com.cfloresh.appcitaspsic.menus;

import com.cfloresh.appcitaspsic.appusers.Paciente;
import com.cfloresh.appcitaspsic.appusers.Psicologo;
import com.cfloresh.appcitaspsic.appusers.Usuario;
import com.cfloresh.appcitaspsic.enums.Enfoque;
import com.cfloresh.appcitaspsic.enums.RazonConsulta;

import java.util.ArrayList;

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
    public void realizarAccion(int accion, ArrayList<Paciente> pacientes, ArrayList<Psicologo> psicologos) {

        switch(accion) {
            case 1 -> {
                System.out.println("Usted seleccionó: Nuevo psicólogo");
                /* TODO: Implementar repo y añadir métodos correspondientes para añadir psicólogos */
                psicologos.add(new Psicologo("Luis", "Fonseca", "Zapopan, Jal", 32));
                psicologos.get(0).setEnfoque(Enfoque.COGNITIVO_CONDUCTUAL);
                psicologos.get(0).setAreasDeExp(RazonConsulta.PROBLEMAS_DE_PAREJA);
            }
            case 2 -> {
                System.out.println("Usted seleccionó: Nuevo Paciente");
                /* TODO: Implementar repo y añadir métodos correspondientes para añadir pacientes */
                pacientes.add(new Paciente("Christian", "Flores", "Zapopan, Jal", 25));
                pacientes.get(0).setRazonDeConsulta(RazonConsulta.ANSIEDAD);
            }
        }
    }

}
