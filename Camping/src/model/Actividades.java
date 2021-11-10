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
 * @author nagga
 */
public class Actividades {
    
    private int identificador;
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private Date hora;
    private TipoActividad actividad;
    private Cliente cliente;
    private ArrayList<Actividades> actividades = new ArrayList<>(); //todas las actividades??
    private ArrayList<Actividades> actividades_dia = new ArrayList<>(); //Actividades que deberían mostrarse en el día

    public Actividades(int identificador, Date hora, TipoActividad actividad) {
        this.identificador = identificador;
        this.hora = hora;
        this.actividad = actividad;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public TipoActividad getActividad() {
        return actividad;
    }

    public void setActividad(TipoActividad actividad) {
        this.actividad = actividad;
    }
    
     public ArrayList reservaActividades(ArrayList<Actividades> actividades_cliente)
    { 
        for (int i=0; i < actividades.size(); i++)
        {
              if(actividades.get(i).equals(actividades_cliente))
              {
                  actividades_dia.add(actividades.get(i));
                  
              } 
        }
        return actividades_dia;
    }
        
    public ArrayList cancelarActividad(ArrayList<Actividades> actividad_escogida, Cliente cliente_actividad)
    {
        
        for (int i=0; i < actividades_dia.size(); i++)
        {
              if(actividades_dia.get(i).equals(actividad_escogida) && (cliente.getNombre()== cliente_actividad.getNombre()))
              {
                  actividades_dia.remove(i);
              }  
        }
        return actividades_dia;
    }
    
    
}