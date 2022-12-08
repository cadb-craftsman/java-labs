/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.model;

import java.util.ArrayList;

/**
 *
 * @author Charlie
 */
public class MenuDia {
    
    private String [] primeros = {"sopa", "ensalada", "berengena"};
    private String [] segundos = {"pollo", "pescado", "ternera"};
    private String [] postres = {"pudin", "elado", "cafe", "fruta"};
    
    private ArrayList<JB_Platillos> menuDia;
    
    public void setMenuDia(JB_Platillos platillo){
        if(this.menuDia == null){
            this.menuDia = new ArrayList<JB_Platillos>();
        }
        this.menuDia.add(platillo);
    }
    
    public ArrayList<JB_Platillos> getMenuDia(){
        return this.menuDia;
    }
    
    public void inicializar(){
        JB_Platillos platillo = new JB_Platillos(primeros, segundos, postres);
        setMenuDia(platillo);
    }
}
