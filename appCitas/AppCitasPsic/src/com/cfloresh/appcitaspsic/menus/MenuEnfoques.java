package com.cfloresh.appcitaspsic.menus;

import com.cfloresh.appcitaspsic.appusers.Psicologo;
import com.cfloresh.appcitaspsic.appusers.Usuario;
import com.cfloresh.appcitaspsic.enums.Enfoque;

public class MenuEnfoques extends Menu{

    public MenuEnfoques(String mensajePrincial){

        minMenuValue = 1;
        maxMenuValue = 3;

        this.mensajePrincipal = mensajePrincial;
        StringBuilder opmsg = new StringBuilder("1. Cognitivo Conductual\n")
                .append("2. Psicoanalisis\n")
                .append("3. Sistematico\n")
                .append("Seleccione una opción: ");
        mensajeOpciones = opmsg.toString();
    }

    @Override
    public void realizarAccion(int accion, Usuario userPsicologo) {
        switch(accion){
            case 1 -> ((Psicologo)userPsicologo).setEnfoque(Enfoque.COGNITIVO_CONDUCTUAL);
            case 2 -> ((Psicologo)userPsicologo).setEnfoque(Enfoque.PSICOANALISIS);
            case 3 -> ((Psicologo)userPsicologo).setEnfoque(Enfoque.SISTEMATICO);
        }
    }
}
