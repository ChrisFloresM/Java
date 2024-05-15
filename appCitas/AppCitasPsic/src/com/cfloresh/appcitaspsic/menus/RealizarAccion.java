package com.cfloresh.appcitaspsic.menus;

import com.cfloresh.appcitaspsic.appusers.*;

import java.util.ArrayList;

public interface RealizarAccion {

    void realizarAccion(int accion, ArrayList<Paciente> pacientes, ArrayList<Psicologo> psicologos);
    void realizarAccion(int accion, ArrayList<Usuario> users);
    void realizarAccion(int accion, Usuario user);

}
