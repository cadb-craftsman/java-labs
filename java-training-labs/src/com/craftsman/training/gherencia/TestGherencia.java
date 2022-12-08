package com.craftsman.training.gherencia;

public class TestGherencia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Persona p = new Persona("Juan", 24, "Su casa S/N");
		Empleado e = new Empleado("Jefe", 5000, p);
		e.comprobarCategoria(p);
		Directivo d = new Directivo(10, true, e);

		System.out.println("Persona: " + p.toString());
		System.out.println("Empleado: " + e.toString());
		System.out.println("Directivo: " + d.toString());

	}

}
