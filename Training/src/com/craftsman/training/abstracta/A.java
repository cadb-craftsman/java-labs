package com.craftsman.training.abstracta;

public abstract class A {
	// La superclase es abstracta porque define un m�todo abstracto
	// La superclase NO IMPLEMENTA el m�dodo llamame, deja los detalles a la
	// subclase

	abstract void llamame();

	void OtraLlamada() {
		System.out.println("Este es un m�todo concreto");
	}
}
