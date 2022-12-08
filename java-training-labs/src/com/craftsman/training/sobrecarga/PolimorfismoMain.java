package com.craftsman.training.sobrecarga;

public class PolimorfismoMain {

	public static void main(String[] args) {
		double resultado;
		
		ClaseOperaciones op = new ClaseOperaciones();

		resultado = op.suma(8, 9);
		System.out.println("resultado 1: " + resultado);
		
		resultado = op.suma(8, 9, 10);
		System.out.println("resultado 2: " + resultado);
		
		resultado = op.suma(new double []{4,5,6,7,8,9,10});
		System.out.println("resultado 3: " + resultado);
		
	}
}