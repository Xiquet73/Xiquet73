/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author pagarjo
 */
public class Gerente {
    
    private String nomg, apeg, dnig, dirg, locg, corg;
    private int tfnog;
    
    public Gerente(String nomg, String apeg, String dnig, String dirg, String locg, String corg, int tfnog) {
    
        this.nomg = nomg;
        this.apeg = apeg;
        this.dnig = dnig;
        this.dirg = dirg;
        this.locg = locg;
        this.corg = corg;
        this.tfnog = tfnog;
    }
    
    public void getNombreG() {
        return nomg;
        }
    
    public String setNombreG(String ng) {
        this.nomg = ng;
        }

    public void getApellidosG() {
        return apeg;
        }

    public String setApellidosG(String ag) {
        this.apeg = ag;
        }
    
    public void getDniG() {
        return dnig;
        }
    
    public String setDniG(String d) {
        this.dnig = d;
        }
    
    public void getDireccionG() {
        return dirg;
        }
    
    public String setDireccionG(String dg) {
        this.dirg = dg;
        }
    
    public void getLocalidadG() {
        return locg;
        }
    
    public String setLocalidadG(String lg) {
        this.locg = lg;
        }
    
    public void getCorreoG() {
        return corg;
        }

    public String setCorreoG(String cg) {
        this.corg = cg;
        }

    public void getTfnoG() {
        return tfnog;
        }

    public int setTfnoG(int tg) {
        this.tfnog = tg;
        }
    
    @Override
    public String toString() {
        return "Nombre: "+nomg+" Apellidos: "+apeg+" DNI: "+dnig+" Direccion: "+dirg+" Localidad: "+locg+" Correo electronico: "+corg+" Telefono"+tfnog;
        }
}