package com.craftsman.training.herencia;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		a.i = 10;
		a.j = 20;
		System.out.println();
		a.mostrarij();
		System.out.println();

		B b = new B();
		b.i = 7;
		b.j = 8;
		b.k = 9;

		b.mostrarij();
		b.mostrark();
		System.out.println("suma ");
		b.sum();

	}

}
