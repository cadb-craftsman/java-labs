package com.craftsman.training.figuras.geometricas;

public class Punto {

	private double puntoX;
	private double puntoY;

	public Punto() {
		super();
	}

	public Punto(double puntoX, double puntoY) {
		super();
		this.puntoX = puntoX;
		this.puntoY = puntoY;
	}

	public double getPuntoX() {
		return puntoX;
	}

	public void setPuntoX(double puntoX) {
		this.puntoX = puntoX;
	}

	public double getPuntoY() {
		return puntoY;
	}

	public void setPuntoY(double puntoY) {
		this.puntoY = puntoY;
	}

	public double calcularDistanciaDesde(Punto p) {
		double distancia = Math.sqrt((Math.pow((this.puntoX - p.getPuntoX()), 2)) + (Math.pow((this.puntoY - p.getPuntoY()), 2)));		
		return distancia;
	}
}