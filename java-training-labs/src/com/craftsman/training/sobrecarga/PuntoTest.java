package com.craftsman.training.sobrecarga;

public class PuntoTest {

	public static void main(String[] args) {
		
		Punto p1 = new Punto(10, 10);
		Punto p2 = new Punto(10, 10);
		Punto p3 = new Punto(5, 5);
		
		System.out.println("Punto 1 == Punto 2 " + p1.iguales(p2));
		System.out.println("Punto 1 == Punto 2 " + p1.iguales(p3));
		
	}

}
