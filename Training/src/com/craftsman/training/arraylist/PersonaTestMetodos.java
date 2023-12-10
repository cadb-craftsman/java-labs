package com.craftsman.training.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonaTestMetodos {

	public static Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {
		int opc = 0;
		ArrayList<Persona> l = new ArrayList<Persona>();

		do {
			opc = menu();

			switch (opc) {
			case 1:
				System.out.println("Introduce la Edad ");
				int edad = lector.nextInt();
				System.out.println("Introduce el DNI ");
				int dni = lector.nextInt();
				System.out.println("Introduce el nombre ");
				String nombre = lector.next();
				System.out.println("Introduce los apellidos ");
				String apellidos = lector.next();
				Persona p = new Persona(edad, dni, nombre, apellidos);
				l.add(p);
				break;

			case 2:
				for (int i = 0; i < l.size(); i++) {
					System.out.print("Datos:");
					l.get(i).imprimirValores();
				}
				break;

			case 0:
				System.out.println("Gracias por utilizar la BBDD Personas");
				break;

			default:
				System.out.println("El valor introducido es incorrecto");
				break;
			}

		} while (opc != 0);

	}

	public static int menu() {
		int opc = 0;
		System.out.println("Bienvenido a la BBDD Personas "
				+ "\n [Operaciones]" + "\n 1 - Insertar persona"
				+ "\n 2 - Listar Personas" + "\n 0 - Salir");
		opc = lector.nextInt();
		return opc;
	}
}
