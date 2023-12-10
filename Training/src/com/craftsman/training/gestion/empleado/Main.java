package com.craftsman.training.gestion.empleado;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {

		OracleGestionEmpleado gestionEmpleado = new OracleGestionEmpleado();
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		int opc = 0;		
		
		do {
			opc = menu();

			switch (opc) {
			case 1:
				System.out.println("Opcion 1");
				System.out.println("Instroduce codigo de empleado");
				int codigo = lector.nextInt();

				System.out.println("Instroduce nombre de empleado");
				String nombre = lector.next();

				System.out.println("Instroduce fecha de entrada");
				System.out.print("");
				System.out.println("Dia");
				String dia = lector.next();
				System.out.println("Mes");
				String mes = lector.next();
				System.out.println("A�o");
				String anio = lector.next();
				String fechaEntrada = dia + "-" + mes + "-" + anio;

				System.out.println("Instroduce salario de empleado");
				float salario = lector.nextFloat();

				System.out.println("Instroduce categoria de empleado");
				String categoria = lector.next();

				empleados.add(new Empleado(codigo, nombre, fechaEntrada,
						salario, categoria));

				break;
			case 2:
				System.out.println("Opcion 2" + empleados.size());
				for (Empleado empleado : empleados) {
					System.out.println(empleado.toString());
				}

				break;
			case 3:
				System.out.println("Opcion 3");
				gestionEmpleado.instertar(empleados);

				break;
			case 4:
				System.out.println("Opcion 4");
				gestionEmpleado.consultar();

				break;
			case 0:
				System.out.println("Opcion 0");
				System.exit(0);

				break;
			default:

				System.out.println("Opcion no valida");

				break;
			}
		} while (opc != 0);
		 
	}

	public static int menu() {
		int opc = 0;
		System.out.println("Menu Tabla EMPLE " + "\n [Operaciones]"
				+ "\n 1 - Insertar Datos" + "\n 2 - Mostrar Datos de ArrayList"
				+ "\n 3 - Insertar Datos en BD"
				+ "\n 4 - Consultar Datos de BD" + "\n 0 - Salir");
		opc = lector.nextInt();
		return opc;
	}
}
