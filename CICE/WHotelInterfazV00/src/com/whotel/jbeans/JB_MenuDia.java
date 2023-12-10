/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whotel.jbeans;

import java.util.ArrayList;

/**
 *
 * @author Charlie
 */
public class JB_MenuDia {
       
    private ArrayList<JB_MenuPlato> menuPlatoList;
    private ArrayList<JB_Plato> platoList;

    public JB_MenuDia(){}
    
    public JB_MenuDia(ArrayList<JB_MenuPlato> menuPlatoList, ArrayList<JB_Plato> platoList) {        
        this.menuPlatoList = menuPlatoList;
        this.platoList = platoList;
    }

    /**
     * @return the menuPlatoList
     */
    public ArrayList<JB_MenuPlato> getMenuPlatoList() {
        return menuPlatoList;
    }

    /**
     * @param menuPlatoList the menuPlatoList to set
     */
    public void setMenuPlatoList(ArrayList<JB_MenuPlato> menuPlatoList) {
        this.menuPlatoList = menuPlatoList;
    }

    /**
     * @return the platoList
     */
    public ArrayList<JB_Plato> getPlatoList() {
        return platoList;
    }

    /**
     * @param platoList the platoList to set
     */
    public void setPlatoList(ArrayList<JB_Plato> platoList) {
        this.platoList = platoList;
    }
    
}
