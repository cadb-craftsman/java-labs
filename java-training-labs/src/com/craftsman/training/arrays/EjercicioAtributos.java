package com.craftsman.training.arrays;

import java.util.Arrays;
import java.util.Scanner;
public class EjercicioAtributos {

		/* Leer cinco strings, guardarlos en un array y listarlos.
		 * A trav�s de atributos:
		 *  - mostrar la longitud
		 *  - Rellenar otro array con una misma palabra que se pida al usuario 
		 *  - listar el array
		 *  - copiar un array en otro y listarlos
		 *  - comparar si son iguales
		 *  - volver a pedir cinco palabras al usuario
		 *  - ordenar este array y listarlo ordenado
		 */
	
	public static void main(String[] args) {
		
		Scanner lector = new Scanner (System.in);
		String palabras[] = new String[5];
		String copiapalabras[] = new String[5];
				
		for (int i = 0; i<5 ; i++ ){
			System.out.println("Introduce una palabra ");
			palabras[i] = lector.next();
		}
		
		for (int i = 0; i< 5; i++ )
			System.out.println("Las palabras introducidas son "+palabras[i]);
		
		System.out.println("La longitud es " + palabras.length); 
		
		System.out.println("Introduce una palabra ");
		String cadena = lector.next();
		
		Arrays.fill(palabras,cadena);//Todo el array vale lo que ponga en cadena
		
		for (int i = 0; i< 5; i++ )
			System.out.println("Las palabras introducidas son "+palabras[i]);
		
		
		System.arraycopy(palabras, 0, copiapalabras, 0, palabras.length);
		
		for (int i = 0; i< 5; i++ )
			System.out.println("Las palabras introducidas son "+palabras[i]);
		
			for (int i = 0; i< 5; i++ )
			System.out.println("Las palabras copiadas son "+ copiapalabras[i]);
		
			boolean compara = Arrays.equals(palabras,copiapalabras);
			
			if (compara)
				System.out.println("Son iguales");
			else
				System.out.println("No son iguales");
		
			
			for (int i = 0; i<5 ; i++ ){
				System.out.println("Introduce otras 5 palabras ");
				palabras[i] = lector.next();
			}
			
			System.out.println("El array ordenado");
			
			
			Arrays.sort(palabras);
			for (int i = 0; i< 5; i++ )
				System.out.println("Las palabras ordenadas son "+palabras[i]);
			
	
	}

}
