/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whotel.negocio;

import com.whotel.jbeans.JB_Menu;
import com.whotel.jbeans.JB_MenuDia;
import com.whotel.jbeans.JB_MenuPlato;
import com.whotel.jbeans.JB_Plato;
import java.util.ArrayList;

/**
 *
 * @author Charlie
 */
public class GestionWHotel {
    
    private static final String PRIMEROS = "primero";
    private static final String SEGUNDOS = "segundo";
    private static final String POSTRES = "postre";
    
    private static GestionWHotel gestionWHotel;
    
    
    
    public ArrayList<JB_MenuDia> getMenuDia(int menuTipo){
        
        ArrayList<JB_MenuDia> menuDiaList = new ArrayList<JB_MenuDia>();              
        
        WHMenuPlatoImplements menuPlatoImpl = new WHMenuPlatoImplements();
        ArrayList<JB_MenuPlato> menuPlatoList0 =  menuPlatoImpl.consultar(menuTipo, PRIMEROS);
        ArrayList<JB_MenuPlato> menuPlatoList1 =  menuPlatoImpl.consultar(menuTipo, SEGUNDOS);
        ArrayList<JB_MenuPlato> menuPlatoList2 =  menuPlatoImpl.consultar(menuTipo, POSTRES);
        
        System.out.println("menuPlatoList0 " + menuPlatoList0.size());
        System.out.println("menuPlatoList1 " + menuPlatoList1.size());
        System.out.println("menuPlatoList2 " + menuPlatoList2.size());
        
        WHPlatoImplements platoImpl = new WHPlatoImplements();
        ArrayList<JB_Plato> platoList = new ArrayList<JB_Plato>();
        
        for(JB_MenuPlato menuPlato : menuPlatoList0){
            System.out.println("menuPlatoList0: " + menuPlato.getPlatoID());
            JB_Plato plato = new JB_Plato();
            plato = platoImpl.consultar(menuPlato.getPlatoID());
            platoList.add(plato);
        }
        
        for(JB_MenuPlato menuPlato : menuPlatoList1){
            System.out.println("menuPlatoList1: " + menuPlato.getPlatoID());
            JB_Plato plato = new JB_Plato();
            plato = platoImpl.consultar(menuPlato.getPlatoID());
            platoList.add(plato);
        }        

        for(JB_MenuPlato menuPlato : menuPlatoList2){
            System.out.println("menuPlatoList2: " + menuPlato.getPlatoID());
            JB_Plato plato = new JB_Plato();
            plato = platoImpl.consultar(menuPlato.getPlatoID());
            platoList.add(plato);
        }        
        System.out.println("platoList: " + platoList.size());
        
        JB_MenuDia menuDia0 = new JB_MenuDia(menuPlatoList0, platoList);
        JB_MenuDia menuDia1 = new JB_MenuDia(menuPlatoList1, platoList);
        JB_MenuDia menuDia2 = new JB_MenuDia(menuPlatoList2, platoList);
        
        menuDiaList.add(menuDia0);
        menuDiaList.add(menuDia1);
        menuDiaList.add(menuDia2);
        
        return menuDiaList;
    }    
    
    public ArrayList<JB_Menu> getMenu(){        
        
        WHMenuImplements menuImpl = new WHMenuImplements();
        ArrayList<JB_Menu> menuList = menuImpl.consultar();
        
        return menuList;
    }
    
    private synchronized static void createInstance(){
        if (gestionWHotel == null) {
            gestionWHotel = new GestionWHotel();
        }
    }
    
    public synchronized static GestionWHotel getInstance(){
        if(gestionWHotel == null){
            createInstance();
        }
        return gestionWHotel;
    }
}
