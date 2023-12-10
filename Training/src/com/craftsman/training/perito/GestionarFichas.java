package com.craftsman.training.perito;

import java.util.Scanner;

public class GestionarFichas {

	static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Taller t1 = new Taller("El cortes", "Poveda 19", "998578456", "el_cortes@gmail.com");
		Taller t2 = new Taller("Dinamitero", "El centro 80", "998451278", "dinaamitero@yahoo.com");
		PeritoAgenda pAgenda = new PeritoAgenda();
		
		int opc = 0;

		do {
			opc = menu();

			switch (opc) {
			case 1:
				System.out.println("Por favor introdusca el codigo");
				int codigo = lector.nextInt();
				System.out.println("Por favor introdusca la matricula");
				String matricula = lector.next();
				System.out.println("Por favor introdusca la descripci�n");
				String descripcion = lector.next();
				System.out.println("Por favor introdusca el precio");
				double precio = lector.nextDouble();
				System.out.println("Por favor introdusca el taller T1 = 1, T2 = 2");
				int t = lector.nextInt();
				Partes p = null;
				if (t == 1) {
					 p = new Partes(codigo, matricula, descripcion, precio, t1);
				}else if (t == 2) {
					 p = new Partes(codigo, matricula, descripcion, precio, t2);
				}
				pAgenda.insertarParte(p);				
				break;

			case 2:
				System.out.println("Por favor introdusca el codigo que desea buscar");
				int c = lector.nextInt();
				System.out.println(pAgenda.buscarParte(c).toString());
				break;

			case 3:
				for (int i = 0; i < pAgenda.getListaPartes().size(); i++) {
					System.out.println(pAgenda.getListaPartes().get(i).toString());
				}
				break;
			case 4:
				System.out.println("Por favor introdusca el codigo que desea eliminar");
				int b = lector.nextInt();
				pAgenda.eliminarParte(b);
				break;
			case 5:
				for (int i = 0; i < pAgenda.getListaPartes().size(); i++) {
					System.out.println(pAgenda.getListaPartes().get(i).getDatosTaller().toString());
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
		System.out.println("Gestion de Partes " + "\n [Operaciones]"
				+ "\n 1 - Insertar Parte" 
				+ "\n 2 - Buscar Parte"
				+ "\n 3 - Mostrar Parte" 
				+ "\n 4 - Eliminar Parte"
				+ "\n 5 - Listar Partes"
				+ "\n 0 - Salir");
		opc = lector.nextInt();
		return opc;
	}
	
}
