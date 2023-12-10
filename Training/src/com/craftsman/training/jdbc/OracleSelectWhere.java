package com.craftsman.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class OracleSelectWhere {

	public static void main(String[] args) {
		Connection con = null;
		String usuario = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; 
		Scanner lector = new Scanner(System.in);
		try {			
			DriverManager.registerDriver(new OracleDriver());
			con = DriverManager.getConnection(url, usuario, password);
			System.out.println("Conexion OK");
			Statement stm = con.createStatement();			
			
			/*System.out.println("Introduce el nombre de un departamento");
			int codigo = lector.nextInt();
			//Buscar por departamento			
			String queryCodigo = "SELECT * FROM DEPT WHERE DEPTNO = " + codigo;
			ResultSet rs = stm.executeQuery(queryCodigo);*/
			
			//Buscar por localidad y mostrar toda la informacion
			System.out.println("Introduce el nombre de una localidad");
			String localidad = lector.next();
			String queryLocalidad = "SELECT * FROM DEPT WHERE LOC = " + "'" + localidad + "'";
			ResultSet rs = stm.executeQuery(queryLocalidad);
			
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