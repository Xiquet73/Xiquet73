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
public class FactoryCrearParcela {
    
    private int identificador;
    private float tamanyo;
    private float descuento;
    boolean reservado, electricidad;
    private float precio;
    ModelParcela parcela;
    
     public FactoryCrearParcela(int identificador, float tamanyo, float descuento, boolean reservado, float precio, boolean electricidad) {
        this.identificador = identificador;
        this.tamanyo = tamanyo;
        this.descuento = descuento;
        this.reservado = reservado; 
        this.electricidad = electricidad;
        this.precio = precio;
        
        parcela = new ModelParcela(identificador,tamanyo,descuento,reservado,precio,electricidad);
    }
    
    
}
