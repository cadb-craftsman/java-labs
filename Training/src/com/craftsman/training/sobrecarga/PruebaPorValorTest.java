package com.craftsman.training.sobrecarga;

public class PruebaPorValorTest {

	public static void main(String[] args) {
		
		int x = 24;
		PruebaPorValor prueba = new PruebaPorValor();
		prueba.pasoDeArgumentos(x);
		System.out.println("El valor de la variable x despues del metodo es: " + x);
		
		int [] miarray = {24,24};
		PruebaPorValor pruebaDos = new PruebaPorValor();
		pruebaDos.metodo1(miarray);	
		System.out.println("El valor de miarray[0] despues del metodo es: " + miarray[0]);
	}
	
}