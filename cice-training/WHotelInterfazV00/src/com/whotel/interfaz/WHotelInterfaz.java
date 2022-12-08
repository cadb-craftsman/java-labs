/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whotel.interfaz;

import com.whotel.jbeans.JB_MenuDia;

/**
 *
 * @author root
 */
public interface WHotelInterfaz {
    
    public int insertar();
    public JB_MenuDia consultar(String nombre, String tipo);    
    public void eliminar();
    public void modificar();
    
}
