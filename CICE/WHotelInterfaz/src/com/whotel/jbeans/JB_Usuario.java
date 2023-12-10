/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whotel.jbeans;

import java.io.Serializable;

/**
 *
 * @author Charlie
 */
public class JB_Usuario implements Serializable {
   
    private String nombreUsuario;
    private String numeroHabitacion;

    public JB_Usuario(String usuario, String habitacion){
        this.nombreUsuario = usuario;
        this.numeroHabitacion = habitacion;
    }
    
    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the numeroHabitacion
     */
    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    /**
     * @param numeroHabitacion the numeroHabitacion to set
     */
    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }    
    
}
