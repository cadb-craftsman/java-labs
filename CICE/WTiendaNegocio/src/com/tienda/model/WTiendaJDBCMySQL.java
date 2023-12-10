/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.model;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Charlie
 */
public class WTiendaJDBCMySQL {

    private Connection con = null;
    private static WTiendaJDBCMySQL wHotelJDBCMySQL = null;
    
    public Connection getConection() {
        
        String usuario = "root";
        String password = "root";
        String url = "jdbc:mysql://127.0.0.1:3306/tienda";

        try {
            DriverManager.registerDriver(new Driver());
            con = DriverManager.getConnection(url, usuario, password);
        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
        } 
        return  con;
    }

    public void closeConection(){
        try{
            this.con.close();
        }catch(SQLException e){
            System.err.println("SQLException: " + e.getMessage());
        } 
    }
    
    private static synchronized void createInstance(){     
        if(wHotelJDBCMySQL == null){
            wHotelJDBCMySQL = new WTiendaJDBCMySQL();
        }
    }
    
    public static WTiendaJDBCMySQL getInstance(){
        if (wHotelJDBCMySQL == null) {
            createInstance();
        }
        return wHotelJDBCMySQL;
    }
}
