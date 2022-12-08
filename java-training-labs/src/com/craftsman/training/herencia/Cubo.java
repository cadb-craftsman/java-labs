package com.craftsman.training.herencia;

public class Cubo {

	double ancho;
	double alto;
	double largo;

	Cubo(double x, double y, double z) {
		ancho = x;
		alto = y;
		largo = z;
	}

	Cubo(Cubo ob) {
		ancho = ob.ancho;
		alto = ob.alto;
		largo = ob.largo;
	}

	Cubo() {
		ancho = -1;
		alto = -1;
		largo = -1;
	}

	Cubo(double len) {
		ancho = alto = largo = len;
	}

	double volumen() {
		return (ancho * alto * largo);
	}

}
