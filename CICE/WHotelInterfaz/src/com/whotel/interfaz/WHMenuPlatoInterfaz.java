/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whotel.interfaz;

import com.whotel.jbeans.JB_MenuPlato;
import java.util.List;

/**
 *
 * @author Charlie
 */
public interface WHMenuPlatoInterfaz {
    public List<JB_MenuPlato> consultar(String nombre, String tipo); 
}
