/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Pablo
 */
class Tiendas {
    
    private String nombre;
    private float metros_cuadrados;
    private int identificador;

    public Tiendas(String nombre, float metros_cuadrados, int identificador) {
        this.nombre = nombre;
        this.metros_cuadrados = metros_cuadrados;
        this.identificador = identificador;
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

    public void setMetros_cuadrados(float metros_cuadrados) {
        this.metros_cuadrados = metros_cuadrados;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    
}
