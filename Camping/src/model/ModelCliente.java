/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Raga Casan, Ignacio 
 * @version 1.0
 */
public class ModelCliente {
    
    // Declaracion de variables
    private String nombre, dni, telefono, correo;

    /**
     * Constructor de cliente
     * @param nombre
     * @param dni
     * @param telefono
     * @param correo 
     */
    public ModelCliente(String nombre, String dni, String telefono, String correo) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
    }

     /**
     * Devuelve el nombre del cliente
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Asigna el nombre al cliente
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     /**
     * Devuelve el DNI del cliente
     * @return dni
     */
    public String getDni() {
        return dni;
    }
    
    /**
     * Asigna el DNI al cliente
     * @param dni 
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

     /**
     * Devuelve el telefono del cliente
     * @return telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Asigna el telefono al cliente
     * @param telefono 
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

     /**
     * Devuelve el correo del cliente
     * @return correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Asigna el correo al cliente
     * @param correo 
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
