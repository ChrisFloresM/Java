package com.cfloresh.appcitaspsic;

import com.cfloresh.appcitaspsic.menus.MenuInicio;
import com.cfloresh.appcitaspsic.repo.*;

public class TestConsultas {

    public static void main(String[] args) {

        RepoPsic personalPsicologos = new RepoPsic();
        RepoPacientes listaPacientes = new RepoPacientes();

        while(true) {
            MenuInicio menuTest = new MenuInicio("Bienvenido a New Life Horizons");
            menuTest.realizarAccion(menuTest.mostrarMenu(), listaPacientes, personalPsicologos);
        }

    }
}
