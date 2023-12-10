package com.craftsman.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class OracleBBDD {

	public static void main(String[] args) {
		Connection con = null;
		String usuario = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; 
		
		try {			
			DriverManager.registerDriver(new OracleDriver());
			con = DriverManager.getConnection(url, usuario, password);
			System.out.println("Conexion OK");
			Statement stm = con.createStatement();
			//Se obtienen los campos ENAME, JOB, SAL de la tabla EMP
			ResultSet rs = stm.executeQuery("SELECT ENAME, JOB, SAL FROM EMP");
			
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			
		} catch (SQLException e) {
			System.err.println("Error " + e.getMessage());
			e.printStackTrace();		
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}			
			System.out.println("Se ha cerrado la conexion OK");
		}		
	}
}