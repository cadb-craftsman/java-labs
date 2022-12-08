package com.craftsman.training.figuras.geometricas;

public class FigurasGeometricasTest {

	public static void main(String[] args) {

		Punto pA = new Punto(5, 5);
		Punto pB = new Punto(8, 8);
		Punto pC = new Punto(10, 10);
		
		System.out.println("Distancia del punto: " + pA.calcularDistanciaDesde(pB));
	
		Circulo c = new Circulo(pA, 5d);
		
		System.out.println("Area Circulo: " + c.calcularArea());
		System.out.println("Perimetro Circulo: " + c.calcularPerimetro());
		System.out.println("Distancia del punto: " + c.calcularDistanciaDesde(pB));
		
		Triangulo t = new Triangulo(pA, pB, pC);
		
		System.out.println("Perimetro triangulo: " + t.calcularPerimetro());
		System.out.println("Distancia del punto: " + t.calcularDistanciaDesde(pC));
		
	}

}