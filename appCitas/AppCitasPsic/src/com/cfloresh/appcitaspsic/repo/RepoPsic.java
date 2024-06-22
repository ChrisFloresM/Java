package com.cfloresh.appcitaspsic.repo;

import com.cfloresh.appcitaspsic.appusers.Psicologo;
import com.cfloresh.appcitaspsic.appusers.Usuario;
import com.cfloresh.appcitaspsic.enums.Enfoque;
import com.cfloresh.appcitaspsic.menus.MenuEnfoques;
import com.cfloresh.appcitaspsic.menus.MenuRazonConsulta;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class RepoPsic implements CrudRepo {

    private ArrayList<Psicologo> psicologos;

    /* constructor */
    public RepoPsic(){
        psicologos = new ArrayList<>();
    }

    @Override
    public Usuario findId(Integer id) {
        return null;
    }

    public ArrayList<Psicologo> getPsicologos() {
        return psicologos;
    }

    @Override
    public void crear(Usuario usuario) {
        this.psicologos.add((Psicologo)usuario);
    }

    @Override
    public void leer(Usuario usuario) {

    }

    @Override
    public void editar(Usuario usuario) {

    }

    @Override
    public void eliminar(Integer id) {

    }

    public Psicologo inputUserData(){
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        String nombre = in.nextLine();

        System.out.print("Ingrese apellido: ");
        String apellido = in.nextLine();

        System.out.print("Ingrese localidad:  ");
        String localidad = in.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = in.nextInt();

        Psicologo newPsic = new Psicologo(nombre, apellido, localidad, edad);

        MenuEnfoques menuEnfoques = new MenuEnfoques("¿Cuál es su enfoque");
        menuEnfoques.realizarAccion(menuEnfoques.mostrarMenu(), newPsic);

        MenuRazonConsulta menuRazonConsulta = new MenuRazonConsulta("¿Cuál es su área de experiencia?");
        menuRazonConsulta.realizarAccion(menuRazonConsulta.mostrarMenu(), newPsic);

        return newPsic;
    }
}
