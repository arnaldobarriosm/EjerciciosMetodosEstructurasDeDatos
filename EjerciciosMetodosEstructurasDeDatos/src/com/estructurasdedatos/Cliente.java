package com.estructurasdedatos;

/**
 *
 * @author abarrios
 */
public class Cliente {

    private int id;
    private String cedula;
    private String nombre;
    private String apellido;

    public Cliente(){
        this.id = 0;
        this.cedula = "";
        this.nombre = "";
        this.apellido = "";
    }

    public Cliente(String cedula, String nombre, String apellido){
        this.id = 0;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Cliente(int id, String cedula, String nombre, String apellido){
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString(){
        return "Cliente{Id= " + id + " cedula= " + cedula + ", nombre='" + nombre + "', apellido='" + apellido + "'}";
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCedula(){
        return cedula;
    }

    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

}
