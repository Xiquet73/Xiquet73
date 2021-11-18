/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import view.Cliente;
import model.Datos;

/**
 *
 * @author Pablo
 */
public class FachadaCrearParcela {
    
    Datos datos;
    private int identificador ;
    private float tamanyo;
    private float descuento;
    boolean reservado, electricidad;
    private float precio;

    public FachadaCrearParcela(Datos datos, float tamanyo, float descuento, boolean electricidad, float precio) {
        this.datos = datos;
        this.tamanyo = tamanyo;
        this.descuento = descuento;
        this.reservado = false;
        this.electricidad = electricidad;
        this.precio = precio;
        this.CrearParcelaNueva(this.datos, this.tamanyo, this.descuento, this.reservado,
                this.precio, this.electricidad);
    }
   
    
    
    public void CrearParcelaNueva(Datos datos, float tamanyo, float descuento, boolean reservado, float precio, boolean electricidad){
    int identificador;
    int max = -1;
    
    for (int i=0; i < datos.parcelas.size(); i++)
    {
        identificador = this.datos.parcelas.get(i).getIdentificador();
        if(max < identificador)
        {
            max = identificador;
        }
    }
        
    max++;
    
    
    ModelParcela parcela = new ModelParcela(max,tamanyo,descuento,
            reservado,precio,electricidad);
    
    datos.addParcela(parcela);
    }

    
        
        
        
    
    
    
    
    
   
    
}
