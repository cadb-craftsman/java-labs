package com.craftsman.training.cubo;

public class FiguraAbstracta {

	private int lado;
	private Cubo c;

	public FiguraAbstracta(){
		super();
	}
	
	public FiguraAbstracta(int lado, Cubo c) {
		super();
		this.lado = lado;
		this.c = c;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public Cubo getC() {
		return c;
	}

	public void setC(Cubo c) {
		this.c = c;
	}	
}