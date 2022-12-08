package com.craftsman.training.nivelacceso;

public class ValorPunto {

	private int x;
	private int y;

	public ValorPunto() {
		super();
	}

	public ValorPunto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// Sin Getters ni Setters
	public void PonX(int xEntrante) {
		x = xEntrante;
	}

	public void PonY(int yEntrante) {
		y = yEntrante;
	}

	public int DevuelveX() {
		return x;
	}

	public int DevuelveY() {
		return y;
	}

	// Sin constructor

	public void InicializaPunto(int xEntrante, int yEntrante) {
		x = xEntrante; // Obliga a poner un tipo de valor de retorno
		y = yEntrante;
	}

	public void MuestraValores() {
		System.out.println("X es " + x);
		System.out.println("Y es " + y);
	}
}
