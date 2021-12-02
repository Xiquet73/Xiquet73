/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Pablo
 */
public class ParcelasReservaTest {
    
    public ParcelasReservaTest() {
    }

    @Test
    public void testGetParcela() {
    }

    @Test
    public void testSetParcela() {
    }

    @Test
    public void testGetTiendas() {
    }

    @Test
    public void testSetTiendas() {
    }

    @Test
    public void testAnayadirTiendas() {
        
    ModelParcela parcela = new ModelParcela();
    ModelTienda tienda = new ModelTienda("Roja",3);
    ArrayList<ModelTienda> tiendas = new ArrayList<>();
    ParcelasReserva pr = new ParcelasReserva(parcela);
    
    int res1 = tiendas.size();
    pr.anayadirTiendas(tienda);
    
    int res2 = tiendas.size();
    
    assertTrue(res1 + 1 == res2);
    
    
    
    
    
        
    }
    
}
