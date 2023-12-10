package com.craftsman.training.sobreescitura;

public class B extends A {
	int k;

	B(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	void mostrar() {
		System.out.println("K : " + k);
	}
}
