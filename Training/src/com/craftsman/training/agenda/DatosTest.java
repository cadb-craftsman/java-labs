package com.craftsman.training.agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class DatosTest {

	static Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {
		String nombre, telefono, otrosDatos;
		ArrayList<Datos> agenda = new ArrayList<Datos>();

		int opc = 0;

		do {
			opc = menu();

			switch (opc) {
			case 1:
				System.out.println("Por favor introdusca el nombre");
				nombre = lector.next();
				System.out.println("Por favor introdusca el telefono");
				telefono = lector.next();
				System.out.println("Por favor introdusca otrosDatos");
				otrosDatos = lector.next();
				Datos d = new Datos(nombre, telefono, otrosDatos);
				agenda.add(d);
				break;

			case 2:
				System.out.println("Por favor introdusca el nombre que desea eliminar ");
				nombre = lector.next();
				for (int i = 0; i < agenda.size(); i++) {
					if (agenda.get(i).getNombre().equalsIgnoreCase(nombre)) {
						agenda.remove(i);
					}
				}
				break;

			case 3:
				System.out.println("Por favor introdusca el nombre que desea modificar ");
				nombre = lector.next();
				for (int i = 0; i < agenda.size(); i++) {
					if (agenda.get(i).getNombre().equalsIgnoreCase(nombre)) {
						System.out.println("Por favor introdusca el nombre");
						nombre = lector.next();
						agenda.get(i).setNombre(nombre);
						System.out.println("Por favor introdusca el telefono");
						telefono = lector.next();
						agenda.get(i).setTelefono(telefono);
						System.out.println("Por favor introdusca otrosDatos");
						otrosDatos = lector.next();
						agenda.get(i).setOtrosDatos(otrosDatos);
					}
				}
				break;
			case 4:
				for (int i = 0; i < agenda.size(); i++) {
					System.out.println(agenda.get(i).toString());
				}
				break;
				
			case 0:
				System.out.println("Se termina la aplicaci�n ...");
				break;

			default:
				System.out.println("El valor introducido es incorrecto");
				break;
			}

		} while (opc != 0);

	}

	public static int menu() {
		int opc = 0;
		System.out.println("Agenda de Datos Personales " + "\n [Operaciones]"
				+ "\n 1 - Insertar Datos" 
				+ "\n 2 - Eliminar Datos"
				+ "\n 3 - Modificar Datos" 
				+ "\n 4 - Mostrar Datos"
				+ "\n 0 - Salir");
		opc = lector.nextInt();
		return opc;
	}

}
