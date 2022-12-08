package com.craftsman.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OracleCRUDCommit {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		// BLOQUE TRY CATCH GENERAL
		try {
			String driverName = "oracle.jdbc.driver.OracleDriver";			
			Class.forName(driverName);

			// Configurar una conexi�n a la base de datos
			String serverName = "127.0.0.1";
			String portNumber = "1521";
			String sid = "xe";
			String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;
			String username = "scott";
			String password = "tiger";

			con = DriverManager.getConnection(url, username, password);
			/*****************************************************************/
			con.setAutoCommit(false);//Se quita el commit automatico desde java
			/*****************************************************************/
			System.out.println("OK");

			// BLOQUE TRY-CATCH DE INSERT-SELECT
			try {
				// INSERTAR
				Scanner lector = new Scanner(System.in);
				System.out.println("Dame c�digo de departamento ");
				int deptno = lector.nextInt();
				System.out.println("Dame nombre de departmento ");
				String dname = lector.next();
				System.out.println("Dame localidad ");
				String loc = lector.next();

				String insertar = "insert into dept values(" + deptno + ",'" + dname + "','" + loc + "')";

				st = con.createStatement();
				int n = st.executeUpdate(insertar);
				System.out.println("REGISTRO INSERTADO");
				System.out.println("Numero de registros insertados " + n);

				// AHORA LISTO EL CONTENIDO CON SELECT
				st = con.createStatement();
				String query = "select * from dept";
				rs = st.executeQuery(query);

				while (rs.next()) {
					System.out.print(rs.getInt(1));
					System.out.print(" " + rs.getString(2));
					System.out.print(" " + rs.getString(3));
					System.out.println("");
				}

			} catch (SQLException e) {
				System.out.println(e);
			}
			// �� HACE COMMIT CADA VEZ QUE SE HACE UNA OPERACION CONTRA LA BD !!
			// BLOQUE TRY-CATCH DE UPDATE-SELECT
			try {
				// ACTUALIZAR NOMBRE DEPARTAMENTO POR CODIGO
				Scanner lector = new Scanner(System.in);
				System.out.println("Dame c�digo de departamento ");
				int deptno = lector.nextInt();
				System.out.println("Dame nombre de departmento ");
				String dname = lector.next();

				String actualizar = " update dept set dname = " + "'" + dname
						+ "'" + "where deptno=" + deptno;

				int n = st.executeUpdate(actualizar);
				System.out.println("REGISTRO ACTUALIZADO ");
				System.out.println("Numero de registros actualizados " + n);

				// AHORA LISTO EL CONTENIDO CON SELECT
				st = con.createStatement();
				String query = "select * from dept";
				rs = st.executeQuery(query);

				while (rs.next()) {
					System.out.print(rs.getInt(1));
					System.out.print(" " + rs.getString(2));
					System.out.print(" " + rs.getString(3));
					System.out.println("");
				}

			} catch (SQLException e) {
				System.out.println(e);
			}
			// BLOQUE TRY-CATCH DE DELETE-SELECT
			try {
				// BORRAR POR DEPARTAMENTO
				Scanner lector = new Scanner(System.in);
				System.out.println("Dame c�digo de departamento ");
				int deptno = lector.nextInt();

				String borrar = " delete from dept where deptno =  " + deptno;

				int n = st.executeUpdate(borrar);
				System.out.println("REGISTRO BORRADO ");
				System.out.println("Numero de registros borrados " + n);
				// AHORA LISTO EL CONTENIDO CON SELECT
				st = con.createStatement();
				String query = "select * from dept";
				rs = st.executeQuery(query);
				con.commit(); //Se realiza el commit de la Transacci�n
				//con.rollback();
				while (rs.next()) {
					System.out.print(rs.getInt(1));
					System.out.print(" " + rs.getString(2));
					System.out.print(" " + rs.getString(3));
					System.out.println("");
				}
			} catch (SQLException e) {
				System.out.println(e);
			}

		} catch (ClassNotFoundException e) { // No se pudo encontrar el controlador de base de datos
			System.out.println("Error 1 " + e.getMessage());
		} catch (SQLException e) { // Otros de conexi�n
			System.out.println("Error 2 " + e.getMessage());
		}
	}
}