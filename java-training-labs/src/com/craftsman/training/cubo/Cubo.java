package com.craftsman.training.cubo;

public class Cubo {

	private int lado;

	public Cubo() {
		super();
	}

	public Cubo(int lado) {
		super();
		this.lado = lado;
	}

	public Cubo(Cubo c) {
		this.lado = c.getLado();
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public void cubito() {
		System.out.println("Metodo cubito de Cubo");
	}

}