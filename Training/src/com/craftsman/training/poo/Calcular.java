package com.craftsman.training.poo;

public class Calcular {

	public double [] calcularEcuacion(double a, double b, double c) {		
		double [] x = new double[2]; 
		x[0] = (-b + Math.sqrt((b * b) - (4 * (a * c)))) / (2 * a);
		x[1] = (-b - Math.sqrt((b * b) - (4 * (a * c)))) / (2 * a);
		return x;
	}
}