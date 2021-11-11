/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Pacheco Garcia, Jose Miguel
 * @version 1.0
*/
public class Gerente {
    
    private String nomg, apeg, dnig, dirg, locg, corg, tfnog;
    
    /**
     * Constructor de gerente
     * @param nomg
     * @param apeg
     * @param dnig
     * @param dirg
     * @param locg
     * @param corg
     * @param tfnog 
     */
    public Gerente(String nomg, String apeg, String dnig, String dirg, String locg, String corg, String tfnog) {
        this.nomg = nomg;
        this.apeg = apeg;
        this.dnig = dnig;
        this.dirg = dirg;
        this.locg = locg;
        this.corg = corg;
        this.tfnog = tfnog;
    }
    
    /**
     * Devuelve el nombre del gerente
     * @return nomg
     */
    public String getNombre() {
        return nomg;
        }
        
    /**
     * Asigna el nombre del gerente
     * @param ng 
     */
    public void setNombre(String ng) {
        this.nomg = ng;
        }
    /**
     * Devuelve el apellido del gerente
     * @return apeg
     */
    public String getApellidos() {
        return apeg;
        }
    /**
     * Asigna el apellido del gerente
     * @param ag 
     */
    public void setApellidos(String ag) {
        this.apeg = ag;
        }
    
     /**
     * Devuelve el DNI del gerente
     * @return dnig
     */
    public String getDni() {
        return dnig;
     }
     
    /**
     * Asigna el Dni del gerente
     * @param d 
     */
    public void setDni(String d) {
        this.dnig = d;
    }
    
     /**
     * Devuelve la direccion del gerente
     * @return dirg
     */
    public String getDireccion() {
        return dirg;
    }
    
     /**
     * Asigna la direccion del gerente
     * @param dg 
     */
    public void setDireccionG(String dg) {
        this.dirg = dg;
        }
    
     /**
     * Devuelve el locg del gerente
     * @return locg
     */
    public String getLocalidad() {
        return locg;
        }
    
     /**
     * Asigna la localizacion del gerente
     * @param lg 
     */
    public void setLocalidad(String lg) {
        this.locg = lg;
    }
     
    /**
     * Devuelve el correo del gerente
     * @return corg
     */
    public String getCorreo() {
        return corg;
    }

     /**
     * Asigna el correo del gerente
     * @param cg
     */
    public void setCorreo(String cg) {
        this.corg = cg;
    }

    /**
     * Devuelve el telefono del gerente
     * @return tfnog
     */
    public String getTelefono() {
        return tfnog;
        }

     /**
     * Asigna el telefono del gerente
     * @param tg
     */
    public void setTelefono(String tg) {
        this.tfnog = tg;
        }
    
    // Metodo sobreescrito toString para mostrar todos lso datos del cliente
    @Override
    public String toString() {
        return "Nombre: " + nomg + " Apellidos: " + apeg + 
               " DNI: " + dnig + " Direccion: " + dirg + " Localidad: " + locg + 
               " Correo electronico: " + corg + " Telefono" + tfnog;
        }
}