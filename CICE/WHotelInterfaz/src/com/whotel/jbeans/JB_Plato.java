/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whotel.jbeans;

/**
 *
 * @author Charlie
 */
public class JB_Plato {
    
    private int platoID;
    private String platoNombre;    
    private int platoCalorias;
    private int platoCucharas;
    
    public JB_Plato(int platoID, String platoNombre, int platoCalorias, int platoCucharas){
        this.platoID = platoID;
        this.platoNombre = platoNombre;
        this.platoCalorias = platoCalorias;
        this.platoCucharas = platoCucharas;        
    }

    /**
     * @return the platoID
     */
    public int getPlatoID() {
        return platoID;
    }

    /**
     * @param platoID the platoID to set
     */
    public void setPlatoID(int platoID) {
        this.platoID = platoID;
    }

    /**
     * @return the platoNombre
     */
    public String getPlatoNombre() {
        return platoNombre;
    }

    /**
     * @param platoNombre the platoNombre to set
     */
    public void setPlatoNombre(String platoNombre) {
        this.platoNombre = platoNombre;
    }

    /**
     * @return the platoCalorias
     */
    public int getPlatoCalorias() {
        return platoCalorias;
    }

    /**
     * @param platoCalorias the platoCalorias to set
     */
    public void setPlatoCalorias(int platoCalorias) {
        this.platoCalorias = platoCalorias;
    }

    /**
     * @return the platoCucharas
     */
    public int getPlatoCucharas() {
        return platoCucharas;
    }

    /**
     * @param platoCucharas the platoCucharas to set
     */
    public void setPlatoCucharas(int platoCucharas) {
        this.platoCucharas = platoCucharas;
    }
    
    
}
