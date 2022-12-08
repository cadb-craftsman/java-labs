/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whotel.negocio;

import com.whotel.interfaz.WHMenuPlatoInterfaz;
import com.whotel.jbeans.JB_MenuPlato;
import com.whotel.model.WHotelJDBCMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Charlie
 */
public class WHMenuPlatoImplements implements WHMenuPlatoInterfaz{

    /*
    private String SELECT_QUERY = "select "                                
                                + "menus_platos.mp_tipo, menus_platos.plato_id, menus_platos.menu_id,"                                
                                + "from menus, menus_platos "
                                + "where "
                                + "(menus.menu_id = menus_platos.menu_id) and "                                
                                + "(menus_platos.menu_id = ?) and"
                                + "(menus_platos.mp_tipo = ?)";
    */
    @Override
    public List<JB_MenuPlato> consultar(String tipo, String nombre) {
        List<JB_MenuPlato> menuPlatoList = null;
        try{
            String SELECT_QUERY = "select "                                
                                + "menus_platos.mp_tipo, menus_platos.plato_id, menus_platos.menu_id,"                                
                                + "from menus, menus_platos "
                                + "where "
                                + "(menus.menu_id = menus_platos.menu_id) and "                                
                                + "(menus_platos.menu_id = " + tipo + ") and"
                                + "(menus_platos.mp_tipo = " + nombre +")";
            
            Statement stm = WHotelJDBCMySQL.getInstance().getConection().createStatement();
            ResultSet rs = stm.executeQuery(SELECT_QUERY + nombre);

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
                JB_MenuPlato menuPlato = new JB_MenuPlato(rs.getString(1), rs.getInt(2), rs.getInt(3));
                menuPlatoList.add(menuPlato);
            }            
        }catch(SQLException e){
            System.err.println("SQLException: " + e.getMessage());
        }
        return menuPlatoList;
    }
    
}
