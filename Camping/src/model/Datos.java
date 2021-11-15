/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nuñez Tomas, Sergio 
 * @version 1.0
 */
public class Datos {
    
    
    public ArrayList<ModelParcela> parcelas = new ArrayList<ModelParcela>();
    public ArrayList<ModelReserva> reservas = new ArrayList<ModelReserva>();

    public Datos() {
        
        
        // Creamos unas parcelas iniciales
        ModelParcela parcela1 = new ModelParcela(101, 10, 0, false, 100, true);
        ModelParcela parcela2 = new ModelParcela(102, 30, 0, false, 250, false);
        ModelParcela parcela3 = new ModelParcela(103, 20, 0, false, 80, true);
        ModelParcela parcela4 = new ModelParcela(104, 5, 0, false, 20, true);
        ModelParcela parcela5 = new ModelParcela(105, 12, 0, false, 10, true);
        
        
        // Añadimos las parcelas al Array
        parcelas.add(parcela1);
        parcelas.add(parcela2);
        parcelas.add(parcela3);
        parcelas.add(parcela4);
        parcelas.add(parcela5);
        
    }

    public ArrayList<ModelParcela> getParcelas() {
        return parcelas;
    }

    public void setParcelas(ArrayList<ModelParcela> parcelas) {
        this.parcelas = parcelas;
    }

    public ArrayList<ModelReserva> getReserva() {
        return reservas;
    }

    public void addReserva(ModelReserva reserva){
        reservas.add(reserva);
        
    }
    public void addParcela(ModelParcela parcela){
        parcelas.add(parcela);
        
    }


}



