package com.craftsman.training.cubo;

public class Punto {

	private int x;
	private int y;

	public Punto() {
		super();
	}

	public Punto(int x, int y) {
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

	public boolean iguales(int ejeX, int ejeY) {
		boolean respuesta;
		if ((ejeX == x) && (ejeY == y)) {
			respuesta = true;
		} else {
			respuesta = false;
		}
		return respuesta;
	}
	
	public boolean iguales(Punto p) {
		boolean respuesta;
		if ((p.x == x) && (p.y == y)) {
			respuesta = true;
		} else {
			respuesta = false;
		}
		return respuesta;
	}
}