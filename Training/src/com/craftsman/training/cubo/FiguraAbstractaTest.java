package com.craftsman.training.cubo;

public class FiguraAbstractaTest {

	public static void main(String[] args) {
		
		Punto p1 = new Punto(10, 10);
		Punto p2 = new Punto(10, 10);
		Punto p3 = new Punto(5, 5);	
		
		System.out.println("Los puntos p1 y p2 son: " + (p1.iguales(p2) ? "iguales" : "diferentes"));
		System.out.println("Los puntos p1 y p3 son: " + (p1.iguales(p3) ? "iguales" : "diferentes"));
		
		Cubo c1 = new Cubo(5);
		Cubo c2 = new Cubo(c1);
		
		FiguraAbstracta x = new FiguraAbstracta(20, c1);
		FiguraAbstracta y = new FiguraAbstracta(10, c2);		
		
		x.getC().cubito();
		y.getC().cubito();
		
	}
}