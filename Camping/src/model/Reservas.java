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
public class Reservas {
    //Declaracion de variables
    float precio_dia, precio_total;
    Date fecha;
    String parcela;

    
    
    //Getters
    public float getPrecio_dia() {
        return precio_dia;
    }

    public float getPrecio_total() {
        return precio_total;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getParcela() {
        return parcela;
    }
    
    //Setters
    public void setPrecio_dia(float precio_dia) {
        this.precio_dia = precio_dia;
    }

    public void setPrecio_total(float precio_total) {
        this.precio_total = precio_total;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setParcela(String parcela) {
        this.parcela = parcela;
    }
    
    
}
