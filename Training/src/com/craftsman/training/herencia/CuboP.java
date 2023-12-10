package com.craftsman.training.herencia;

public class CuboP {

	protected double ancho;
	private double alto;
	private double largo;

	CuboP(double x, double y, double z) {
		ancho = x;
		alto = y;
		largo = z;
	}

	CuboP(CuboP ob) {
		ancho = ob.ancho;
		alto = ob.alto;
		largo = ob.largo;
	}

	CuboP() {
		ancho = -1;
		alto = -1;
		largo = -1;
	}

	CuboP(double len) {
		ancho = alto = largo = len;
	}

	double volumen() {
		return (ancho * alto * largo);
	}

}
