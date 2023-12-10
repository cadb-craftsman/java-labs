package com.cice.parking.herencia;

import com.cice.parking.vehiculo.Vehiculo;

public class Moto extends Vehiculo {

	private boolean sideCar;

	public Moto(String matricula, String marca, String modelo, String color,
			boolean sidecar) {
		super(matricula, marca, modelo, color);
		this.sideCar = sidecar;
	}

	public void setSideCar(boolean sideCar) {
		this.sideCar = sideCar;
	}

	public boolean getSideCar() {
		return sideCar;
	}

	@Override
	public String toString() {
		return "Moto [sideCar=" + sideCar + ", toString()=" + super.toString()
				+ "]";
	}

}
