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
import java.util.List;

/**
 *
 * @author Charlie
 */
public class GestionWHotel {
    
    private static final String PRIMEROS = "primeros";
    private static final String SEGUNDOS = "segundos";
    private static final String POSTRES = "postres";
    
    private static GestionWHotel gestionWHotel;
    
    
    
    public ArrayList<JB_MenuDia> getMenuDia(String menuNombre){
        
        ArrayList<JB_MenuDia> menuDiaList = new ArrayList<JB_MenuDia>();
        
        WHMenuImplements menuImpl = new WHMenuImplements();
        JB_Menu menu = menuImpl.consultar(menuNombre); 
        
        WHMenuPlatoImplements menuPlatoImpl = new WHMenuPlatoImplements();
        List<JB_MenuPlato> menuPlatoList0 =  menuPlatoImpl.consultar(menuNombre, PRIMEROS);
        List<JB_MenuPlato> menuPlatoList1 =  menuPlatoImpl.consultar(menuNombre, SEGUNDOS);
        List<JB_MenuPlato> menuPlatoList2 =  menuPlatoImpl.consultar(menuNombre, POSTRES);
        
        WHPlatoImplements platoImpl = new WHPlatoImplements();
        List<JB_Plato> platoList0 = platoImpl.consultar(menuPlatoList0.get(0).getPlatoID());
        List<JB_Plato> platoList1 = platoImpl.consultar(menuPlatoList0.get(0).getPlatoID());
        List<JB_Plato> platoList2 =  platoImpl.consultar(menuPlatoList2.get(0).getPlatoID());
        
        JB_MenuDia menuDia0 = new JB_MenuDia(menu, menuPlatoList0, platoList0);
        JB_MenuDia menuDia1 = new JB_MenuDia(menu, menuPlatoList1, platoList1);
        JB_MenuDia menuDia2 = new JB_MenuDia(menu, menuPlatoList2, platoList2);
        
        menuDiaList.add(menuDia0);
        menuDiaList.add(menuDia1);
        menuDiaList.add(menuDia2);
        
        return menuDiaList;
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
