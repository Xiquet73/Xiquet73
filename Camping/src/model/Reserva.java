/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

import java.util.Date;

/**
 *
 * @author nagga
 */

public class Reserva { 
    
    public static final long CONVERSION_MS_DIAS = 86400000;
    
    private float precio_dia, precio_total;
    private Date fecha_entrada, fecha_salida;
    public Cliente cliente;
    
    // Contiene objetos con una parcela y sus tiendas
    protected ArrayList<ParcelasReserva> parcelasReserva = new ArrayList<>();

    /*
        VISTA 1: fecha_entrada, fecha_salida, ArrayList<parcelas>, 
        VISTA 2: ArrayList<ParcelasReserva> // Se agregarian los metros y nombre de cada objeto tienda agregado al objeto ParcelasReserva
        VISTA 3: Objeto Cliente
   
        Crear objeto Reserva
    */


    public Reserva(Date fecha_entrada, Date fecha_salida, ArrayList<ParcelasReserva> parcelasReserva, Cliente cliente) {
        this.parcelasReserva = parcelasReserva;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.cliente = cliente;
        calcularPrecioTotal(fecha_entrada, fecha_salida, parcelasReserva);
    }
    
    

    
    public float getPrecio_dia() {
        return precio_dia;
    }

    public void setPrecio_dia(float precio_dia) {
        this.precio_dia = precio_dia;
    }

    public float getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(float precio_total) {
        this.precio_total = precio_total;
    }

    public Date getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(Date fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    private float calcularPrecioTotal(Date fecha_ini, Date fecha_sal, ArrayList<ParcelasReserva> parcelasReserva) {
        
        precio_dia = 0;
        
        for (int i=0; i < parcelasReserva.size(); i++){
            precio_dia += parcelasReserva.get(i).getParcela().getPrecio();
            precio_total= precio_dia * ((fecha_sal.getTime() - fecha_ini.getTime())) / CONVERSION_MS_DIAS;
        }
        
            this.precio_total = precio_total;
            return precio_total;
    }
    
    
    public ArrayList parcelasDisponibles(Date entrada, Date salida, ArrayList<Parcela> parcelas){
        ArrayList<Parcela> parcelasLibres = new ArrayList<>();
        boolean disponible;
        Parcela _parcelas;
        
        
        for (int i=0; i < parcelas.size(); i++){
            if (parcelas.get(i).getReservado()== false) { 
                parcelasLibres.add(parcelas.get(i));
            }
        }
        
        return parcelasLibres;
            /*
        else
        {
            if ((entrada.getDay() != parcelas.getSalida().getDay() && entrada.after(parcelas.getSalida())))
            {
                
            }
                
        }
            else if ((parcelas.getSalida().getDay() != getEntrada.getDay() && getEntrada.after(salida)))   
                    
            
    
        return ;
    }
*/
    
            
    /* SERGIO: La he comentado xq no tiene utilidad y las he desplazado abajo
    
    public  float realizarReserva(Date fecha_ini, Date fecha_sal, Cliente _cliente, ArrayList<Parcelas> parcelas)
    {
        float coste_total;
        Reserva reserva = new Reserva( precio_dia, precio_total, fecha_entrada, fecha_salida,cliente); // SERGIO: ¿Donde se usa este objeto creado?
        coste_total = calcularPrecioTotal(fecha_ini, fecha_sal, parcelas);
        return coste_total;
        
    }
    */
    /*
    public float realizarReservaClienteNuevo(Date ini, Date sal, ArrayList<Parcelas> parcelas, int id, String nombre,
            String apellido, String dni, String telefono, String email)
    {
        float coste_total;
        Cliente cliente = new Cliente(id,nombre,apellido,dni, telefono, email );
        Reserva reserva = new Reserva( precio_dia, precio_total, ini, sal,cliente);
        coste_total = calcularPrecioTotal(ini, sal, parcelas);
        
        return coste_total;
    }
    */
            
            
            
    }
    
    
}
