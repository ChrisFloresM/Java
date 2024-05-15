package com.cfloresh.appcitaspsic;

import com.cfloresh.appcitaspsic.appusers.Paciente;
import com.cfloresh.appcitaspsic.appusers.Psicologo;
import com.cfloresh.appcitaspsic.menus.MenuInicio;

import java.util.ArrayList;

public class TestConsultas {

    public static void main(String[] args) {

        ArrayList<Psicologo> personalPsicologos = new ArrayList<>();
        ArrayList<Paciente> listaPacientes = new ArrayList<>();

        while(true) {
            MenuInicio menuTest = new MenuInicio("Bienvenido a New Life Horizons");
            menuTest.realizarAccion(menuTest.mostrarMenu(), listaPacientes, personalPsicologos);
        }



/*      personal[0] = new Psicologo("Luis", "Martinez", "Zapopan, Jal", 35);
        personal[0].setAreasDeExp(RazonConsulta.ANSIEDAD);
        personal[0].setEnfoque(Enfoque.COGNITIVO_CONDUCTUAL);

        personal[1] = new Psicologo("Marisa", "Zepeda", "Tuxpan, Jal", 30);
        personal[1].setAreasDeExp(RazonConsulta.PROBLEMAS_DE_PAREJA);
        personal[1].setEnfoque(Enfoque.PSICOANALISIS);

        personal[2] = new Psicologo("Luisa", "Cardona", "Merida, Yuc.", 45);
        personal[2].setAreasDeExp(RazonConsulta.PROBLEMAS_LABORALES);
        personal[2].setEnfoque(Enfoque.SISTEMATICO);*/

/*        Paciente paciente1 = new Paciente("Miguel", "Lopez", "Zapopan, Jal", 23);
        paciente1.setRazonDeConsulta(RazonConsulta.ANSIEDAD);

        for(Psicologo p : personal) {
            if(p.getAreasDeExp().getTextValue().equals(paciente1.getRazonDeConsulta().getTextValue())) {
                paciente1.setPsicologoAsignado(p);
                break;
            }
            System.out.println("No contamos con el personal adecuado");
        }

        Psicologo psicAsignado = paciente1.getPsicologoAsignado();

        if(psicAsignado!= null) {
            System.out.println("Se le asignó el psicólogo: ");
            System.out.println(psicAsignado.toString());
        }*/

    }
}
