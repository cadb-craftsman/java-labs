package com.craftsman.training.excepciones;

public class ExcepcionF {

	public static void main(String[] args) {
		int valor = 1000;
		try {
			for (int i = 0; i < 100; i++) {
				try {
					valor = valor / i;
				} catch (ArithmeticException e) {
					System.err.println("ArithmeticException " + e.getMessage());
				}
				System.out.println("numero " + i);
			}
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
