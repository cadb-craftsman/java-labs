/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whotel.jbeans;

/**
 *
 * @author Charlie
 */
public class JB_Menu {
    
    private int menuID;
    private String menuNombre;
    private double menuPrecio;

    public JB_Menu(){}
    
    public JB_Menu(int menuID, String menuNombre, double menuPrecio){    
        this.menuID = menuID;
        this.menuNombre = menuNombre;
        this.menuPrecio = menuPrecio;
                
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
     * @return the menuNombre
     */
    public String getMenuNombre() {
        return menuNombre;
    }

    /**
     * @param menuNombre the menuNombre to set
     */
    public void setMenuNombre(String menuNombre) {
        this.menuNombre = menuNombre;
    }

    /**
     * @return the menuPrecio
     */
    public double getMenuPrecio() {
        return menuPrecio;
    }

    /**
     * @param menuPrecio the menuPrecio to set
     */
    public void setMenuPrecio(double menuPrecio) {
        this.menuPrecio = menuPrecio;
    }
}
