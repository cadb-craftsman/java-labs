/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whotel.jbeans;

/**
 *
 * @author Charlie
 */
public class JB_MenuElegido {
    
    private String primero;
    private String segundo;
    private String postre;

    public JB_MenuElegido(String primero, String segundo, String postre){
        this.primero = primero;
        this.segundo = segundo;
        this.postre = postre;
    }
    
    /**
     * @return the primero
     */
    public String getPrimero() {
        return primero;
    }

    /**
     * @return the segundo
     */
    public String getSegundo() {
        return segundo;
    }

    /**
     * @return the postre
     */
    public String getPostre() {
        return postre;
    }
    
}
