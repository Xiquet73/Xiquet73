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
    
    public String getNombreG() {
        return nomg;
        }
    
    public void setNombreG(String ng) {
        this.nomg = ng;
        }

    public String getApellidosG() {
        return apeg;
        }

    public void setApellidosG(String ag) {
        this.apeg = ag;
        }
    
    public String getDniG() {
        return dnig;
        }
    
    public void setDniG(String d) {
        this.dnig = d;
        }
    
    public String getDireccionG() {
        return dirg;
        }
    
    public void setDireccionG(String dg) {
        this.dirg = dg;
        }
    
    public String getLocalidadG() {
        return locg;
        }
    
    public void setLocalidadG(String lg) {
        this.locg = lg;
        }
    
    public String getCorreoG() {
        return corg;
        }

    public void setCorreoG(String cg) {
        this.corg = cg;
        }

    public int getTfnoG() {
        return tfnog;
        }

    public void setTfnoG(int tg) {
        this.tfnog = tg;
        }
    
    @Override
    public String toString() {
        return "Nombre: "+nomg+" Apellidos: "+apeg+" DNI: "+dnig+" Direccion: "+dirg+" Localidad: "+locg+" Correo electronico: "+corg+" Telefono"+tfnog;
        }
}