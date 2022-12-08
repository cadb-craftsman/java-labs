package com.craftsman.training.poo;

public class Ecuacion {

	public static void main(String[] args) {
		Calcular calcular = new Calcular();
		double [] x = calcular.calcularEcuacion(2, 2, -3);
		System.out.println("Resultado de la ecuaci�n positiva: " + x[0]);		
		System.out.println("Resultado de la ecuaci�n negativa: " + x[1]);
	}
}