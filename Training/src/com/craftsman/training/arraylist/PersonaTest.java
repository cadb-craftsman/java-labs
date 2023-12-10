package com.craftsman.training.arraylist;

import java.util.ArrayList;

public class PersonaTest {

	public static void main(String[] args) {

		Persona p1 = new Persona(25, 98574521, "Jose", "Perez");
		Persona p2 = new Persona(25, 98575412, "Cristina", "Diez");

		ArrayList<Persona> l = new ArrayList<Persona>();

		l.add(p1);
		l.add(p2);

		for (int i = 0; i < l.size(); i++) {
			System.out.print("Datos:");
			l.get(i).imprimirValores();
		}

	}

}
