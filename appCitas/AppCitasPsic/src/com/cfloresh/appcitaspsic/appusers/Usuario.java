package com.cfloresh.appcitaspsic.appusers;

abstract public class Usuario {

    protected String nombre;
    protected String apellido;
    protected String localidad;
    protected int edad;

    abstract public void modificarDatos();

    public Usuario(String nombre, String apellido, String localidad, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.localidad = localidad;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
