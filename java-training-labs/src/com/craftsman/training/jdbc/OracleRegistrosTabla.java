package com.craftsman.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class OracleRegistrosTabla {

	public static Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {
		Connection con = null;
		String usuario = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

		try {
			DriverManager.registerDriver(new OracleDriver());
			con = DriverManager.getConnection(url, usuario, password);
			System.out.println("Conexion OK");
			System.out.println("Introduce nombre de tabla");
			String nombreTabla = lector.next();
			Statement stm = con.createStatement();
			// Se obtiene los campos deptno, dname, loc y count de la tabla dept
			ResultSet rs = stm.executeQuery("SELECT COUNT(*) as c FROM " + nombreTabla);

			System.out.println("NUM_REGISTROS");

			while (rs.next()) {
				System.out.println(rs.getInt(1));
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