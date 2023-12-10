/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.model;

/**
 *
 * @author Charlie
 */
public class JB_Platillos {
    
    private String [] primeros;
    private String [] segundos;
    private String [] postres;

    public JB_Platillos(String [] primeros, String [] segundos, String [] postres){
        this.primeros = primeros;
        this.segundos = segundos;
        this.postres = postres;                
    }
    
    /**
     * @return the primeros
     */
    public String [] getPrimeros() {
        return primeros;
    }

    /**
     * @param primeros the primeros to set
     */
    public void setPrimeros(String [] primeros) {
        this.primeros = primeros;
    }

    /**
     * @return the segundos
     */
    public String [] getSegundos() {
        return segundos;
    }

    /**
     * @param segundos the segundos to set
     */
    public void setSegundos(String [] segundos) {
        this.segundos = segundos;
    }

    /**
     * @return the postres
     */
    public String [] getPostres() {
        return postres;
    }

    /**
     * @param postres the postres to set
     */
    public void setPostres(String [] postres) {
        this.postres = postres;
    }
    
}
