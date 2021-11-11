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
public class ModelTienda{
    
    private String nombre;
    private int metros_cuadrados;


    
    public ModelTienda(String nombre, int metros_cuadrados) {
        this.nombre = nombre;
        this.metros_cuadrados = metros_cuadrados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getMetros_cuadrados() {
        return metros_cuadrados;
    }

    public void setMetros_cuadrados(int metros_cuadrados) {
        this.metros_cuadrados = metros_cuadrados;
    }
    
    }
