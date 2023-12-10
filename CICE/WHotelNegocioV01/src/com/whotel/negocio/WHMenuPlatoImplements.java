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
import java.util.ArrayList;

/**
 *
 * @author Charlie
 */
public class WHMenuPlatoImplements implements WHMenuPlatoInterfaz{

    @Override
    public ArrayList<JB_MenuPlato> consultar(int tipo, String nombre) {
        ArrayList<JB_MenuPlato> menuPlatoList = new ArrayList<JB_MenuPlato>();
        try{
            String SELECT_QUERY = "select * from menus_platos where (menus_platos.menu_id ="+tipo+") and (menus_platos.mp_tipo = '"+nombre+"');";                                  
            
            Statement stm = WHotelJDBCMySQL.getInstance().getConection().createStatement();
            ResultSet rs = stm.executeQuery(SELECT_QUERY);

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getInt(2) + " " + rs.getInt(3));
                JB_MenuPlato menuPlato = new JB_MenuPlato(rs.getString(1), rs.getInt(2), rs.getInt(3));
                menuPlatoList.add(menuPlato);
            }            
        }catch(SQLException e){
            System.err.println("SQLException: " + e.getMessage());
        }
        return menuPlatoList;
    }
}
