/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whotel.negocio;

import com.whotel.interfaz.WHotelPlatoInterfaz;
import com.whotel.jbeans.JB_MenuPlato;
import com.whotel.jbeans.JB_Plato;
import com.whotel.model.WHotelJDBCMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Charlie
 */
public class WHPlatoImplements implements WHotelPlatoInterfaz{

    private String SELECT_QUERY = "select "
                                + "platos.plato_id, platos.plato_nombre, platos.plato_calorias, platos.plato_cuchara"
                                + "from platos, menus_platos "
                                + "where "                                
                                + "(menus_platos.plato_id = ";

    @Override
    public List<JB_Plato> consultar(int platoID) {
        List<JB_Plato> platoList = null;
        try{
            Statement stm = WHotelJDBCMySQL.getInstance().getConection().createStatement();
            ResultSet rs = stm.executeQuery(SELECT_QUERY + platoID);

            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
                JB_Plato plato = new JB_Plato(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
                platoList.add(plato);
            }            
        }catch(SQLException e){
            System.err.println("SQLException: " + e.getMessage());
        }
        return platoList;
    }    

}
