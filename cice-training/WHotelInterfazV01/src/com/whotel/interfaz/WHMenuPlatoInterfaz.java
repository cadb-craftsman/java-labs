/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whotel.interfaz;

import com.whotel.jbeans.JB_MenuPlato;
import java.util.ArrayList;

/**
 *
 * @author Charlie
 */
public interface WHMenuPlatoInterfaz {
    public ArrayList<JB_MenuPlato> consultar(int tipo, String nombre); 
}
