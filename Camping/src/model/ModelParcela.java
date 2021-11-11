/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author nagga
 */
public class ModelParcela {
    
    private int identificador;
    private float tamanyo;
    private float descuento;
    boolean reservado, electricidad;

    private float precio;

    public ModelParcela(int identificador, float tamanyo, float descuento, boolean reservado, float precio, boolean electricidad) {
        this.identificador = identificador;
        this.tamanyo = tamanyo;
        this.descuento = descuento;
        this.reservado = reservado; 
        this.electricidad = electricidad;
        this.precio = precio;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public float getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(float tamanyo) {
        this.tamanyo = tamanyo;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public boolean getReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }


    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
