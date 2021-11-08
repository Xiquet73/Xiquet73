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
public class Parcelas {
    
    private int identificador;
    private float tamanyo;
    private float descuento;
    boolean reservado;
    private Date entrada;
    private Date salida;
    private float precio;

    public Parcelas(int identificador, float tamanyo, float descuento, boolean reservado, Date entrada, Date salida, float precio) {
        this.identificador = identificador;
        this.tamanyo = tamanyo;
        this.descuento = descuento;
        this.reservado = reservado; 
        this.entrada = entrada;
        this.salida = salida;
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

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
