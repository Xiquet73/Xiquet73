/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Heras Labrada, Pablo
 * @version 1.0 
 */
class TipoActividad {
    
    private String nombre;
    private int identificador;

    /**
    * Constructor 
    */
    public TipoActividad(String nombre, int identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
    }
    /**
     * Devuelve el nombre del tipo de actividad
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Anyade el nombre del tipo de actividad
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Devuelve el id del tipo de actividad
     * @return identificador
     */
    public int getIdentificador() {
        return identificador;
    }

    /** Devuelve el nombre del tipo de actividad
     * @param identificador 
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
}
