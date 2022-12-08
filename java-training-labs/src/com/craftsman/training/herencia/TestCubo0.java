package com.craftsman.training.herencia;

public class TestCubo0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Sin super()
		// Cubopeso no ve los constructores de cubo

		CuboPeso micubop = new CuboPeso(10, 20, 15, 4.5);
		Cubo micubo = new Cubo();

		double vol;

		// C�lculo del volumen de Cubo
		vol = micubo.volumen();
		System.out.println("Volumen igual a : " + vol);

		// C�lculo del volumen de Cubopeso
		// Cubopeso no tiene volumen, ve el de cubo
		vol = micubop.volumen();
		System.out.println("Volumen igual a : " + vol);

		// Cubo no puede ver las de cubopeso
		// Cubopeso si puede ver las de cubo
		//
		micubo = micubop;
		vol = micubo.volumen();
		System.out.println("Volumen igual a : " + vol);
		
		micubop = (CuboPeso) micubo;
		vol = micubop.volumen();
		System.out.println("Volumen igual a : " + vol);
	}

}
