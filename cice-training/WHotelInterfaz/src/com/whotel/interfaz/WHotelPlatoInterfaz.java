/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whotel.interfaz;

import com.whotel.jbeans.JB_Plato;
import java.util.List;

/**
 *
 * @author Charlie
 */
public interface WHotelPlatoInterfaz {
    public List<JB_Plato> consultar(int platoID); 
}
