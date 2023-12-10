package com.cice.parking.herencia;

import com.cice.parking.vehiculo.Vehiculo;

public class Coche extends Vehiculo {

	private int numeroPuertas;
	
	public Coche(String matricula, String marca, String modelo, String color, int numeroPuertas) {
		super(matricula, marca, modelo, color);		
		this.numeroPuertas = numeroPuertas;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	@Override
	public String toString() {
		return "Coche [numeroPuertas=" + numeroPuertas + ", toString()="
				+ super.toString() + "]";
	}

}
