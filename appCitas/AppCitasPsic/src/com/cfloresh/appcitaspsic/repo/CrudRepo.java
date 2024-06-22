package com.cfloresh.appcitaspsic.repo;
import com.cfloresh.appcitaspsic.appusers.Usuario;

public interface CrudRepo {

    Usuario findId(Integer id);
    void crear(Usuario usuario);
    void leer(Usuario usuario);
    void editar(Usuario usuario);
    void eliminar(Integer id);
}
