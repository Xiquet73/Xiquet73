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
 * @author Freedan
 */
public class Datos {
    
    
    public ArrayList<Parcela> parcelas = new ArrayList<Parcela>();  

    public Datos() {
        
        
        // Creamos unas parcelas iniciales
        Parcela parcela1 = new Parcela(101, 10, 0, false, 100, true);
        Parcela parcela2 = new Parcela(102, 30, 0, false, 250, true);
        Parcela parcela3 = new Parcela(103, 20, 0, false, 80, true);
        Parcela parcela4 = new Parcela(104, 5, 0, false, 20, true);
        Parcela parcela5 = new Parcela(105, 12, 0, false, 10, true);
        
        
        // Añadimos las parcelas al Array
        parcelas.add(parcela1);
        parcelas.add(parcela2);
        parcelas.add(parcela3);
        parcelas.add(parcela4);
        parcelas.add(parcela5);
        
    }

    public ArrayList<Parcela> getParcelas() {
        return parcelas;
    }

    public void setParcelas(ArrayList<Parcela> parcelas) {
        this.parcelas = parcelas;
    }
    
}



