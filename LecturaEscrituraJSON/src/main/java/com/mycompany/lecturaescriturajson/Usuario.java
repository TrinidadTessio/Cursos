package com.mycompany.lecturaescriturajson;


public class Usuario {
    
    private int id;
    private String nombre;
    private String apellido;
    private boolean aceptaNovedades;
    private String correo;

    public Usuario(int id, String nombre, String apellido, boolean aceptaNovedades,String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.aceptaNovedades = aceptaNovedades;
        this.correo = correo;
    }
    
    public Usuario(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isAceptaNovedades() {
        return aceptaNovedades;
    }

    public void setAceptaNovedades(boolean aceptaNovedades) {
        this.aceptaNovedades = aceptaNovedades;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", aceptaNovedades=" + aceptaNovedades + '}';
    }
   
    
}
