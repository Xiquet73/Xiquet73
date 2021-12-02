/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Pablo
 */
public class FachadaCrearParcelaTest {
    
    public FachadaCrearParcelaTest() {
    }

    @Test
    public void testCrearParcelaNueva() {
        
        Datos datos = new Datos();
        float tamanyo=10;
        float descuento = 10;
        boolean reservado = true;
        float precio = 10;
        boolean electricidad = true;
        
        int res1 = datos.getParcelas().size();
        
        FachadaCrearParcela creacion = new FachadaCrearParcela(datos,tamanyo,descuento,electricidad,precio);
        int res2 = datos.getParcelas().size();
         
        assertTrue((res1 + 1) == res2);
       
    }
    
    
    
}
