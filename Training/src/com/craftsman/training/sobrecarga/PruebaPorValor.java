package com.craftsman.training.sobrecarga;

public class PruebaPorValor {
	
	int argumento;

	public void pasoDeArgumentos(int argumento){
		argumento = 25;
		System.out.println("Dentro del metodo vale: " + argumento);
	}
	
	public void metodo1(int [] entero){
		entero[0] = 18;
	}	
}