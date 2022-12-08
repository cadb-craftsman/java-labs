package com.craftsman.training.polimorfismo;

public class TestPolimorfismo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Figura f = new Figura(10, 10);
		Rectangulo r = new Rectangulo(9, 5);
		Triangulo t = new Triangulo(10, 8);

		Figura figref;
		figref = f;
		System.out.println(" Area igual a: " + figref.area());

		figref = r;
		System.out.println(" Area igual a: " + figref.area());

		figref = t;
		System.out.println(" Area igual a: " + figref.area());

	}

}