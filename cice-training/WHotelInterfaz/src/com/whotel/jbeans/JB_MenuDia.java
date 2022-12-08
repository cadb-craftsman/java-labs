/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whotel.jbeans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Charlie
 */
public class JB_MenuDia {

    private JB_Menu menu;    
    private List<JB_MenuPlato> menuPlatoList;
    private List<JB_Plato> platoList;

    public JB_MenuDia(JB_Menu menu, List<JB_MenuPlato> menuPlatoList, List<JB_Plato> platoList) {
        this.menu = menu;
        this.menuPlatoList = menuPlatoList;
        this.platoList = platoList;
    }

    /**
     * @return the menu
     */
    public JB_Menu getMenu() {
        return menu;
    }

    /**
     * @param menu the menu to set
     */
    public void setMenu(JB_Menu menu) {
        this.menu = menu;
    }

    /**
     * @return the menuPlatoList
     */
    public List<JB_MenuPlato> getMenuPlatoList() {
        return menuPlatoList;
    }

    /**
     * @param menuPlatoList the menuPlatoList to set
     */
    public void setMenuPlatoList(List<JB_MenuPlato> menuPlatoList) {
        this.menuPlatoList = menuPlatoList;
    }

    /**
     * @return the platoList
     */
    public List<JB_Plato> getPlatoList() {
        return platoList;
    }

    /**
     * @param platoList the platoList to set
     */
    public void setPlatoList(List<JB_Plato> platoList) {
        this.platoList = platoList;
    }
    
}
