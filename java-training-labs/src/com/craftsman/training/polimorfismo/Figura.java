package com.craftsman.training.polimorfismo;

public class Figura {
	double dim1;
	double dim2;

	Figura(double a, double b) {
		dim1 = a;
		dim2 = b;
	}

	double area() {
		System.out.println("Area para una figura indefinida");
		return 0;
	}

}
