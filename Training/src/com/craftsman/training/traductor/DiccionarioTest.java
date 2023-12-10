package com.craftsman.training.traductor;

import java.util.Scanner;

public class DiccionarioTest {

	static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) {
		Diccionario d = new Diccionario();
		d.inicializarDiccionario();
		String pIngles = null;
		String pEspanol = null;
		System.out.println("Dirrcionario LAROUSSE: ");		
		int opc = 0;		
		
		do {
			opc = menu();
			
			switch (opc) {
			case 1:
				System.out.println("Por favor introdusca la palabra en Ingles que desea insertar");
				pIngles = lector.next();
				System.out.println("Por favor introdusca la palabra en Espa�ol que desea insertar");
				pEspanol = lector.next();
				d.insertarPalabra(pIngles, pEspanol);
				break;
				
			case 2:
				System.out.println("Por favor introdusca la palabra que desea buscar ");
				pIngles = lector.next();
				System.out.println(d.buscarPalabra(pIngles));								
				break;
				
			case 3:
				System.out.println("Por favor introdusca la palabra que desea Eliminar ");
				pIngles = lector.next();
				d.eliminarPalabra(pIngles);
				break;
				
			case 4:
				System.out.println("Por favor introdusca la palabra que desea Modificar ");
				pIngles = lector.next();
				System.out.println("Por favor introdusca la palabra por la cual desea Modificar ");
				pEspanol = lector.next();
				d.modificarPalabra(pIngles, pEspanol);
				break;
			
			case 5:
				System.out.println("Lista de palabras del diccionario LAROUSSE");
				d.mostrarDiccionario();
				break;	

			case 0:
				System.out.println("Gracias por utilizar el diccionario LAROUSSE");				
				break;	
				
			default:
				System.out.println("El valor introducido es incorrecto");
				break;
			}
			
		} while (opc != 0);
		
	}
	
	public static int menu(){		
		int opc = 0;		
		System.out.println("Bienvenido al diccionario LAROUSSE " +
						   "\n [Operaciones]" +
						   "\n 1 - Insertar palabra" +
						   "\n 2 - Buscar palabra" + 
						   "\n 3 - Eliminar palabra" + 
						   "\n 4 - Reemplazar palabra" +
						   "\n 5 - Mostrar diccionario" +						   
						   "\n 0 - Salir");
		opc = lector.nextInt();		
		return opc;
	}
}
