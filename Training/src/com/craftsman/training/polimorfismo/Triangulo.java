package com.craftsman.training.polimorfismo;

public class Triangulo extends Figura {

	Triangulo(double a, double b) {
		super(a, b);
	}

	double area() {
		System.out.println("Area para el tri�ngulo");
		return (dim1 * dim2) / 2;
	}

}
