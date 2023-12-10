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
import java.util.ArrayList;

/**
 *
 * @author Charlie
 */
public class WHMenuImplements implements WHotelMenuInterfaz {

    private String SELECT_QUERY = "select * from menus";

    @Override
    public ArrayList<JB_Menu> consultar() {         
        ArrayList<JB_Menu> menuList = new ArrayList<JB_Menu>();
        try{
            Statement stm = WHotelJDBCMySQL.getInstance().getConection().createStatement();
            ResultSet rs = stm.executeQuery(SELECT_QUERY);

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
                JB_Menu menu = new JB_Menu(rs.getInt(1), rs.getString(2), rs.getDouble(3));
                menuList.add(menu);
            }            
        }catch(SQLException e){
            System.err.println("SQLException: " + e.getMessage());
        }
        return menuList;
    }
}
