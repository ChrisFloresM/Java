package com.cfloresh.appcitaspsic.menus;

import com.cfloresh.appcitaspsic.appusers.Paciente;
import com.cfloresh.appcitaspsic.appusers.Psicologo;
import com.cfloresh.appcitaspsic.appusers.Usuario;
import com.cfloresh.appcitaspsic.enums.Enfoque;
import com.cfloresh.appcitaspsic.enums.RazonConsulta;

public class MenuRazonConsulta extends Menu{

    public MenuRazonConsulta(String mensajePrincial){

        minMenuValue = 1;
        maxMenuValue = 6;

        this.mensajePrincipal = mensajePrincial;
        StringBuilder opmsg = new StringBuilder("1. Ansiedad\n")
                .append("2. Estres\n")
                .append("3. Depresion\n")
                .append("4. Problemas familiares\n")
                .append("5. problemas de pareja\n")
                .append("6. problemas laborales\n")
                .append("Seleccione una opción: ");
        mensajeOpciones = opmsg.toString();
    }

    @Override
    public void realizarAccion(int accion, Usuario user) {
        RazonConsulta razonConsulta;

        razonConsulta = switch(accion){
            case 1 -> RazonConsulta.ANSIEDAD;
            case 2 -> RazonConsulta.ESTRES;
            case 3 -> RazonConsulta.DEPRESION;
            case 4 -> RazonConsulta.PROBLEMAS_FAMILIARES;
            case 5 -> RazonConsulta.PROBLEMAS_DE_PAREJA;
            case 6 -> RazonConsulta.PROBLEMAS_LABORALES;
            default -> throw new IllegalStateException("Unexpected value: " + accion);
        };

        if(user instanceof Psicologo) {
            ((Psicologo)user).setAreasDeExp(razonConsulta);
        } else if (user instanceof Paciente) {
            ((Paciente)user).setRazonDeConsulta(razonConsulta);
        }
    }

}
