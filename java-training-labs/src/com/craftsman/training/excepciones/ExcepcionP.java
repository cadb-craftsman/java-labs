package com.craftsman.training.excepciones;

import java.util.Scanner;

public class ExcepcionP {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int numero = 0;
		System.out.println("Introduce un numero entero");
		try {
			numero = lector.nextInt();
			System.out.println(numero);
		} catch (Exception e) {
			System.err.println("Se ha producido una excepcion: " + e.getMessage());			
		}
	}	
}