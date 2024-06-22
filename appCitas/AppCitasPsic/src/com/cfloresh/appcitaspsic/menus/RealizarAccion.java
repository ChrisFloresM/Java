package com.cfloresh.appcitaspsic.menus;

import com.cfloresh.appcitaspsic.appusers.*;
import com.cfloresh.appcitaspsic.repo.RepoPacientes;
import com.cfloresh.appcitaspsic.repo.RepoPsic;

import java.util.ArrayList;

public interface RealizarAccion {

    void realizarAccion(int accion, RepoPacientes pacientes, RepoPsic psicologos);
    void realizarAccion(int accion, ArrayList<Usuario> users);
    void realizarAccion(int accion, Usuario user);

}
