package com.cice.parking.herencia;

import com.cice.parking.vehiculo.Vehiculo;

public class Camion extends Vehiculo {

	private boolean tara;

	public Camion(String matricula, String marca, String modelo, String color,
			boolean tara) {
		super(matricula, marca, modelo, color);
		this.tara = tara;
	}

	public void setTara(boolean tara) {
		this.tara = tara;
	}

	public boolean getTara() {
		return tara;
	}

	@Override
	public String toString() {
		return "Camion [tara=" + tara + ", toString()=" + super.toString()
				+ "]";
	}

}
