/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whotel.negocio;

import com.whotel.interfaz.WHotelMenuInterfaz;
import com.whotel.jbeans.JB_Menu;
import com.whotel.model.WHotelJDBCMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Charlie
 */
public class WHMenuImplements implements WHotelMenuInterfaz {

    private String SELECT_QUERY = "select "
            + "menus.menu_id, menus.menu_nombre, menus.menu_precio,"
            + "from menus"
            + "where "
            + "menus.menu_nombre = ";

    @Override
    public JB_Menu consultar(String nombre) {
        JB_Menu menu = null;
        try{
            Statement stm = WHotelJDBCMySQL.getInstance().getConection().createStatement();
            ResultSet rs = stm.executeQuery(SELECT_QUERY + nombre);

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
                menu = new JB_Menu(rs.getInt(1), rs.getString(2), rs.getDouble(3));
            }            
        }catch(SQLException e){
            System.err.println("SQLException: " + e.getMessage());
        }
        return menu;
    }
}
