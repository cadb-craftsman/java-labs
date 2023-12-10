package com.craftsman.training.arrays;

public class Operaciones {

	public static int multiplicar(int a, int b) {
		int resultado = a * b;
		return resultado;
	}

	public static int dividir(int a, int b){
		int resultado = a / b;
		return resultado;
	}
	
	public static void main(String[] args) {

		int producto = multiplicar(17, 15);
		System.out.println("producto: " + producto);

		int cociente = dividir(15, 3);
		System.out.println("cociente: " + cociente);
		
		int suma = Adicion.sumar(18, 24);		
		System.out.println("suma: " + suma);
	}
}