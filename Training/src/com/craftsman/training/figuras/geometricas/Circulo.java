package com.craftsman.training.figuras.geometricas;

public class Circulo {

	private Punto p;
	private double r;

	public Circulo() {
		super();
		this.p = new Punto(5, 3);
		this.r = 2d;
	}

	public Circulo(Punto p, double r) {
		super();
		this.p = p;
		this.r = r;
	}

	public Circulo(double x, double y, double z) {
		super();
		this.p.setPuntoX(x);
		this.p.setPuntoY(y);
		this.r = z;
	}

	public Punto getP() {
		return p;
	}

	public double getR() {
		return r;
	}

	public double calcularDistanciaDesde(Punto p) {
		double distancia =  this.p.calcularDistanciaDesde(p);					
		return distancia;
	}

	public double calcularArea() {
		double area = Math.PI * (Math.pow(this.getR(), 2));
		return area;
	}

	public double calcularPerimetro() {
		double perimetro = 2 * Math.PI * this.getR();
		return perimetro;
	}

}