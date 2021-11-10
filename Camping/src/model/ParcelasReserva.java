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
 
    private Parcela parcela;
    private ArrayList<Tienda> tiendas = new ArrayList<>();

    public ParcelasReserva(Parcela parcela) {
        this.parcela = parcela;
    }

    public Parcela getParcela() {
        return parcela;
    }

    public void setParcela(Parcela parcela) {
        this.parcela = parcela;
    }

    public ArrayList<Tienda> getTiendas() {
        return tiendas;
    }

    public void setTiendas(ArrayList<Tienda> tiendas) {
        this.tiendas = tiendas;
    }
    
    public void anayadirTiendas(Tienda tienda)
    {
        this.tiendas.add(tienda);
    }
    
    
    
}
