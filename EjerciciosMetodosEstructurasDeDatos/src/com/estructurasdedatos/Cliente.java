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

    /**
     * @return the id
     */
    public int getId(){
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id){
        this.id = id;
    }

    /**
     * @return the cedula
     */
    public String getCedula(){
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido(){
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
}
