package com.craftsman.training.poo;

class Caja {
	double ancho; 
	double alto;
	double largo;

	double calcularVolumen(double ancho, double alto, double largo) {
		double resultadoVolumen = alto * ancho * largo;
		return resultadoVolumen;
	}
}

class CajaDemo {
	public static void main(String args[]) { 
		Caja miCaja0 = new Caja();
		Caja miCaja1 = new Caja();
		System.out.println("resultado del volumen: " + miCaja0.calcularVolumen(10, 20, 15)); 
		System.out.println("resultado del volumen: " + miCaja1.calcularVolumen(5, 5, 5));		
	}
}