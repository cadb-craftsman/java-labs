/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whotel.model;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Charlie
 */
public class WHotelJDBCMySQL {

    private Connection con = null;
    private static WHotelJDBCMySQL wHotelJDBCMySQL = null;
    
    public Connection getConection() {
        
        String usuario = "root";
        String password = "cice";
        String url = "jdbc:mysql://127.0.0.1:3306/restaurante";

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
            wHotelJDBCMySQL = new WHotelJDBCMySQL();
        }
    }
    
    public static WHotelJDBCMySQL getInstance(){
        if (wHotelJDBCMySQL == null) {
            createInstance();
        }
        return wHotelJDBCMySQL;
    }
}
