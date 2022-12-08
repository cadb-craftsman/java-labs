package com.craftsman.training.arrays;

public class EjercicioArraysUno {

	public static void main(String[] args) {

		int resultado = 0;
		int[] elementos = new int[10];

		for (int i = 0; i < elementos.length; i++) {
			elementos[i] = i * i;
			System.out.println("Elemento: " + elementos[i]);
			resultado += elementos[i];
		}
		System.out.println("Resultado: " + resultado);
	}
}