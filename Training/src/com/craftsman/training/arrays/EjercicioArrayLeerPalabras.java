package com.craftsman.training.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArrayLeerPalabras {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		String[] elementos = new String[5];

		for (int i = 0; i < elementos.length; i++) {
			System.out.println("Introduce una palabra en la posicion " + i);			
			elementos[i] = lector.next();
		}

		int c = 0;
		while (c < elementos.length) {
			System.out.println("Elemento: " + elementos[c]);
			c++;
		}

		// Requerimiento 1 se muestra la longitud del array
		System.out.println("Numero de elementos del Array: " + elementos.length);

		// Requerimiento 2 se rellena otro array con la misma palabra que se
		// pide al usuario
		String[] elementosDos = new String[5];
		System.out.println("Introduce una palabra");
		String palabra = lector.next();
		Arrays.fill(elementosDos, palabra);

		// Requerimiento 3 listar el array
		for (int i = 0; i < elementosDos.length; i++) {
			System.out.println("Elementos array Dos: " + i + elementosDos[i]);
		}

		// Requerimiento 4 copiar el array uno en array dos
		System.arraycopy(elementos, 0, elementosDos, 0, elementos.length);

		// Requerimiento 5 comparar si son iguales
		System.out.println("Los arreglos son iguales? "
				+ Arrays.equals(elementos, elementosDos));

		// Requerimiento 6 Pedir 5 palabras al usuario
		for (int i = 0; i < elementos.length; i++) {
			System.out.println("Introduce una palabra en la posicion: " + i);
			elementos[i] = lector.next();
		}

		// Requerimiento 7 ordenar los elementos del array e imprimirlo ordenado
		System.out.println("Elementos desordenados del array: ");
		for (int i = 0; i < elementos.length; i++) {
			System.out.println(elementos[i]);
		}
		Arrays.sort(elementos);
		System.out.println("Elementos ordenados del array: ");
		for (int i = 0; i < elementos.length; i++) {
			System.out.println(elementos[i]);
		}
	}
}