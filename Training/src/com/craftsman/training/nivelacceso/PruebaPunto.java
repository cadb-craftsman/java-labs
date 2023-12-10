package com.craftsman.training.nivelacceso;

public class PruebaPunto {

	public static void main(String[] args) {

		ValorPunto p1 = new ValorPunto(5, 4);		// Usa su constructor
		ValorPunto p2 = new ValorPunto();
		p2.InicializaPunto(8, 9); // Uso el mio
		
		p1.MuestraValores();
		p2.MuestraValores();

		// Uso sus setters
		p1.setX(6);
		p1.setY(7);
		p1.MuestraValores();

		// Uso sus getters
		System.out.println("Con sus getters vale " + p1.getX() + " " + p1.getY());

		// Uso los mios
		p2.PonX(2);
		p2.PonY(4);
		p2.MuestraValores();
		System.out.println("Con los mios vale " + p2.DevuelveX() + " " + p2.DevuelveY());

	}

}
