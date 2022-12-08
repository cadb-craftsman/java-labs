/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whotel.negocio;

import com.whotel.interfaz.WHotelPlatoInterfaz;
import com.whotel.jbeans.JB_Plato;
import com.whotel.model.WHotelJDBCMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Charlie
 */
public class WHPlatoImplements implements WHotelPlatoInterfaz{

    @Override
    public JB_Plato consultar(int platoID) {
        ArrayList<JB_Plato> platoList = new ArrayList<JB_Plato>();
        try{
            String SELECT_QUERY = "select * from platos where platos.plato_id ="+platoID; 
            Statement stm = WHotelJDBCMySQL.getInstance().getConection().createStatement();
            ResultSet rs = stm.executeQuery(SELECT_QUERY);

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getInt(4));
                JB_Plato plato = new JB_Plato(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
                platoList.add(plato);
            }            
        }catch(SQLException e){
            System.err.println("SQLException: " + e.getMessage());
        }
        return platoList.get(0);
    }    
}
