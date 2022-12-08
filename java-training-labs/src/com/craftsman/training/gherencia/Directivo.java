package com.craftsman.training.gherencia;

public class Directivo extends Empleado {

	private int bonus;
	private boolean coche_empresa;

	public Directivo() {
		super();
	}

	public Directivo(int bonus, boolean coche_empresa, Empleado e) {
		super(e);
		this.bonus = bonus;
		this.coche_empresa = coche_empresa;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public boolean isCoche_empresa() {
		return coche_empresa;
	}

	public void setCoche_empresa(boolean coche_empresa) {
		this.coche_empresa = coche_empresa;
	}

	@Override
	public String toString() {
		return "Directivo [bonus=" + bonus + ", coche_empresa=" + coche_empresa
				+ ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
				+ ", getDireccion()=" + getDireccion() + "]";
	}

}
