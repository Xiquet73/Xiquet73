/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class ParcelasReserva {
 
    private ModelParcela parcela;
    private ArrayList<ModelTienda> tiendas = new ArrayList<>();

    public ParcelasReserva(ModelParcela parcela) {
        this.parcela = parcela;
    }

    public ModelParcela getParcela() {
        return parcela;
    }

    public void setParcela(ModelParcela parcela) {
        this.parcela = parcela;
    }

    public ArrayList<ModelTienda> getTiendas() {
        return tiendas;
    }

    public void setTiendas(ArrayList<ModelTienda> tiendas) {
        this.tiendas = tiendas;
    }
    
    public void anayadirTiendas(ModelTienda tienda)
    {
        this.tiendas.add(tienda);
    }
    
    
    
}
