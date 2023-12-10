package com.craftsman.training.polimorfismo;

public class Rectangulo extends Figura {
	Rectangulo(double a, double b) {
		super(a, b);
	}

	double area() {
		System.out.println("Area para el ret�ngulo");
		return dim1 * dim2;
	}
}
