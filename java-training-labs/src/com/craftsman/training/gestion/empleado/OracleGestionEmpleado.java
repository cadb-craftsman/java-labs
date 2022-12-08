package com.craftsman.training.gestion.empleado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import oracle.jdbc.driver.OracleDriver;

public class OracleGestionEmpleado {

	public Connection crearConexion() {

		Connection con = null;
		String usuario = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

		try {
			DriverManager.registerDriver(new OracleDriver());
			con = DriverManager.getConnection(url, usuario, password);
		} catch (SQLException e) {
			System.err.println("Excepcion metodo crearConexion: " + e.getMessage());
			e.printStackTrace();
		}
		return con;

	}

	public void instertar(ArrayList<Empleado> empleados) {	
		
		Connection con = crearConexion();
		try {			
			System.out.println("Conexion OK");			
			Statement stm = con.createStatement();
			// Se realiza un insert masivo en la tabla de EMPLE
			for (Empleado empleado : empleados) {		
				String query = "INSERT INTO EMPLE VALUES("+ empleado.getCodigo() +",'"+ empleado.getNombre() +"','"+ 
														empleado.getFechaEntrada()  + "'," + empleado.getSalario() +",'"+ 
														empleado.getCategoria()+ "')";
				stm.executeUpdate(query);
			}

		} catch (Exception e) {
			System.err.println("Excepcion metodo insertar: " + e.getMessage());
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
	
	public void consultar(){
		Connection con = crearConexion();
		try {
			System.out.println("Conexion OK");
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM EMPLE");			
			while (rs.next()) {					
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getFloat(4) + " " + rs.getString(5));
			}			
		} catch (Exception e) {
			System.err.println("Excepcion metodo consultar: " + e.getMessage());
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Se ha cerrado la conexion OK");
		}
	}
	
}
