/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whotel.jbeans;

/**
 *
 * @author Charlie
 */
public class JB_MenuPlato {
 
    private int platoID;
    private int menuID;
    private String tipoMenu;    
        
    public JB_MenuPlato(){}
    
    public JB_MenuPlato(String tipoMenu, int platoID, int menuID){
        this.tipoMenu = tipoMenu;        
        this.platoID = platoID;
        this.menuID = menuID;        
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
     * @return the menuID
     */
    public int getMenuID() {
        return menuID;
    }

    /**
     * @param menuID the menuID to set
     */
    public void setMenuID(int menuID) {
        this.menuID = menuID;
    }

    /**
     * @return the tipoMenu
     */
    public String getTipoMenu() {
        return tipoMenu;
    }

    /**
     * @param tipoMenu the tipoMenu to set
     */
    public void setTipoMenu(String tipoMenu) {
        this.tipoMenu = tipoMenu;
    }   
    
}
