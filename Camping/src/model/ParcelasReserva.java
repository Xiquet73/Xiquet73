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
 
    private Parcelas parcela;
    private ArrayList<Tiendas> tiendas = new ArrayList<>();

    public ParcelasReserva(Parcelas parcela) {
        this.parcela = parcela;
    }

    public Parcelas getParcela() {
        return parcela;
    }

    public void setParcela(Parcelas parcela) {
        this.parcela = parcela;
    }

    public ArrayList<Tiendas> getTiendas() {
        return tiendas;
    }

    public void setTiendas(ArrayList<Tiendas> tiendas) {
        this.tiendas = tiendas;
    }
    
    
    
}
