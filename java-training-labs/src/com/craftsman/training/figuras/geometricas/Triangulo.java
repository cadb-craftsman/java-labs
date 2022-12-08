package com.craftsman.training.figuras.geometricas;

public class Triangulo {

	private Punto pX;
	private Punto pY;
	private Punto pZ;

	public Triangulo() {
		super();
		this.pX = new Punto(1, 1);
		this.pY = new Punto(5, 5);
		this.pZ = new Punto(9, 9);
	}

	public Triangulo(Punto pX, Punto pY, Punto pZ) {
		super();
		this.pX = pX;
		this.pY = pY;
		this.pZ = pZ;
	}

	public Triangulo(Punto pX, Punto pY, Punto pZ, Punto pA, Punto pB, Punto pC) {
		super();
		this.pX = pA;
		this.pY = pB;
		this.pZ = pC;
	}

	public Punto getpX() {
		return pX;
	}

	public Punto getpY() {
		return pY;
	}

	public Punto getpZ() {
		return pZ;
	}

	public double calcularDistanciaDesde(Punto p) {
		double distancia = this.pX.calcularDistanciaDesde(p);
		return distancia;
	}

	public double calcularArea() {
		double a, b;

		a = pX.calcularDistanciaDesde(pY);
		b = pY.calcularDistanciaDesde(pZ);		

		double area = (a * b) / 2;
		return area;

	}

	public double calcularPerimetro() {
		double a, b, c;

		a = pX.calcularDistanciaDesde(pY);
		b = pY.calcularDistanciaDesde(pZ);
		c = pZ.calcularDistanciaDesde(pX);

		double perimetro = a + b + c;
		return perimetro;
	}

}