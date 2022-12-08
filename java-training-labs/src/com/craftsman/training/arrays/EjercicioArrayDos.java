package com.craftsman.training.arrays;

import java.util.Scanner;

public class EjercicioArrayDos {

	public static void main(String[] args) {
		int resultado = 0;
		int [] elementos = new int[5];
		Scanner lector = new Scanner(System.in);
		
		for (int i = 0; i < elementos.length; i++) {
			System.out.println("Introduce un elemento " + i);
			elementos[i] = 2 * lector.nextInt();
			System.out.println("Elemento: " + elementos[i]);
			resultado += elementos[i];
		}		
		System.out.println("Resultado: " + resultado);
	}	
}