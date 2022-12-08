package com.craftsman.training.string;

public class ClaseUno {

	int a;
	int b;
		
	public ClaseUno(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "ClaseUno [a=" + a + ", b=" + b + "]";
	}	
}
