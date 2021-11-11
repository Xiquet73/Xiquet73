/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Heras Labrada, Pablo
 * @version 1.0 
 */
public class ParcelasReserva {
 
    //Declaracion de variables
    private ModelParcela parcela;
    private ArrayList<ModelTienda> tiendas = new ArrayList<>();

    public ParcelasReserva(ModelParcela parcela) {
        this.parcela = parcela;
    }

    /**
     * Devuelve las parcelas
     * @return parcela
     */
    public ModelParcela getParcela() {
        return parcela;
    }

    /**
     * Asigna parcelas 
     * @param parcela 
     */
    public void setParcela(ModelParcela parcela) {
        this.parcela = parcela;
    }

    /**
     * Devuelve el ArrayList de las tiendas
     * @return tiendas
     */
    public ArrayList<ModelTienda> getTiendas() {
        return tiendas;
    }

    /**
     * Asigna tiendas
     * @param tiendas 
     */
    public void setTiendas(ArrayList<ModelTienda> tiendas) {
        this.tiendas = tiendas;
    }
    /**
     * Anyade tiendas a los datos del modelo
     * @param tienda 
     */
    public void anayadirTiendas(ModelTienda tienda){
        this.tiendas.add(tienda);
    }
}
