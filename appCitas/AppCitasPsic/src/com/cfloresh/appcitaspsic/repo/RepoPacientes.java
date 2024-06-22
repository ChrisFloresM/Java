package com.cfloresh.appcitaspsic.repo;

import com.cfloresh.appcitaspsic.appusers.Paciente;
import com.cfloresh.appcitaspsic.appusers.Psicologo;
import com.cfloresh.appcitaspsic.appusers.Usuario;
import com.cfloresh.appcitaspsic.menus.MenuEnfoques;
import com.cfloresh.appcitaspsic.menus.MenuRazonConsulta;

import java.util.ArrayList;
import java.util.Scanner;

public class RepoPacientes implements CrudRepo{

    private ArrayList<Paciente> pacientes;

    public RepoPacientes() {
        pacientes = new ArrayList<>();
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    @Override
    public Usuario findId(Integer id) {
        return null;
    }

    @Override
    public void crear(Usuario usuario) {
        pacientes.add((Paciente)usuario);
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

    public Paciente inputUserData() {
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        String nombre = in.nextLine();

        System.out.print("Ingrese apellido: ");
        String apellido = in.nextLine();

        System.out.print("Ingrese localidad:  ");
        String localidad = in.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = in.nextInt();

        Paciente newPac= new Paciente(nombre, apellido, localidad, edad);

        MenuRazonConsulta menuRazonConsulta = new MenuRazonConsulta("¿Cuál es la razón de su consulta?");
        menuRazonConsulta.realizarAccion(menuRazonConsulta.mostrarMenu(), newPac);

        return newPac;
    }
}
