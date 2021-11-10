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
    private ArrayList<Tiendas> tiendas = new ArrayList<>();

    public ParcelasReserva(Parcela parcela) {
        this.parcela = parcela;
    }

    public Parcela getParcela() {
        return parcela;
    }

    public void setParcela(Parcela parcela) {
        this.parcela = parcela;
    }

    public ArrayList<Tiendas> getTiendas() {
        return tiendas;
    }

    public void setTiendas(ArrayList<Tiendas> tiendas) {
        this.tiendas = tiendas;
    }
    
    
    
}
