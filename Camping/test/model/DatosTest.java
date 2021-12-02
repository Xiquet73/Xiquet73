/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static oracle.jrockit.jfr.events.Bits.floatValue;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Amparp-Surface
 */
public class DatosTest {
    
    @Test
    public void testAddReserva() {
        Datos d;
        ArrayList<ParcelasReserva> parcelas = new ArrayList<ParcelasReserva>();
        ParcelasReserva parcela;
        parcela = new ParcelasReserva(new ModelParcela(1, floatValue(10) , floatValue(40), false, floatValue(40), true));
        parcelas.add(parcela);
        d = new Datos();
        try {
            d.addReserva(new ModelReserva("01/01/00", "01/01/01", parcelas, new ModelCliente("Paco", "123456789A", "96111111", "prueba@isii.uv.es"), true));
        } catch (ParseException ex) {
            Logger.getLogger(DatosTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertTrue(d.getReserva().size()>0);
    }

    @Test
    public void testAddParcela() {
        Datos d;
        d = new Datos();
        d.addParcela(new ModelParcela(1, 40, 15, false, 99, true));
        assertTrue(d.getParcelas().size() > 0);
    }

    @Test
    public void testAddActividad() {
        Datos d;
        d = new Datos();
        d.addActividad(new ModelActividades("Actividad", "tipo", "01/01/00", "17:00"));
        assertTrue(d.getActividades().size() > 0);
    }

    @Test
    public void testRemoveActividad() {
        Datos d;
        int numero;
        d = new Datos();
        d.addActividad(new ModelActividades("Actividad", "tipo", "01/01/00", "17:00"));
        numero = d.getActividades().size();
        d.removeActividad(1);
        assertTrue((d.getActividades().isEmpty()) && (numero == 1));
    }
}
