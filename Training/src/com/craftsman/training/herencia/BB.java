package com.craftsman.training.herencia;

public class BB extends AA {

	int i;

	BB(int a, int b) {
		super.i = a;
		i = b;
	}

	/**
	 * @see more information in www.java.com
	 */
	void mostrar() {
		System.out.println("i en la superclase :" + super.i);
		System.out.println("i en la subclase � :" + i);
	}

}
