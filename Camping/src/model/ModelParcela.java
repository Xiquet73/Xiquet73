/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Raga Casan, Ignacio 
 * @version 1.0
 */
public class ModelParcela {
    
    private int identificador;
    private float tamanyo;
    private float descuento;
    boolean reservado, electricidad;

    private float precio;

    /**
     * Constructor de parcela
     * @param identificador
     * @param tamanyo
     * @param descuento
     * @param reservado
     * @param precio
     * @param electricidad 
     */
    public ModelParcela(int identificador, float tamanyo, float descuento, boolean reservado, float precio, boolean electricidad) {
        this.identificador = identificador;
        this.tamanyo = tamanyo;
        this.descuento = descuento;
        this.reservado = reservado; 
        this.electricidad = electricidad;
        this.precio = precio;
    }

    /**
     * Devuelve el identificador de la parcela
     * @return identificador
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * Asigna el identificador de la parcela
     * @param identificador 
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

     /**
     * Devuelve el tamayo de la parcela
     * @return identificador
     */
    public float getTamanyo() {
        return tamanyo;
    }
    /**
     * Asigna el tamaño de la parcela
     * @param tamaño 
     */
    public void setTamanyo(float tamanyo) {
        this.tamanyo = tamanyo;
    }
    
    /**
     * Devuelve el descuento de la parcela
     * @return descuento
     */
    public float getDescuento() {
        return descuento;
    }
    
    /**
     * Asigna el descuento de la parcela
     * @param descuento 
     */
    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
    
    /**
     * Devuelve si esta o no reservado
     * @return reservado
     */
    public boolean getReservado() {
        return reservado;
    }

    /**
     * Asigna el reservado de la parcela
     * @param reservado 
     */
    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    /**
     * Devuelve el precio de la parcela
     * @return precio
     */
    public float getPrecio() {
        return precio;
    }
    
    /**
     * Asigna el precio de la parcela
     * @param precio 
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isElectricidad() {
        return electricidad;
    }

    public void setElectricidad(boolean electricidad) {
        this.electricidad = electricidad;
    }
    
    
}
