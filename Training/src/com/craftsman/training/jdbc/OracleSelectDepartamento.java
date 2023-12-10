package com.craftsman.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class OracleSelectDepartamento {

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
			//Se obtiene los campos deptno, dname, loc y count de la tabla dept
			ResultSet rs = stm.executeQuery("select a.deptno, dname, loc, count(*) from dept a, emp b where a.deptno=b.deptno group by a.deptno,dname, loc HAVING COUNT(*) > 3");
			
			System.out.println("DEPTNO\t\tLOC\t\tDNAME\t\tCOUNT");
			
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t" + rs.getInt(4));
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
