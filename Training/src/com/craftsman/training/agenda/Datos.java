package com.craftsman.training.agenda;

public class Datos {

	private String nombre;
	private String telefono;
	private String otrosDatos;

	public Datos(String nombre, String telefono, String otrosDatos) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.otrosDatos = otrosDatos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getOtrosDatos() {
		return otrosDatos;
	}

	public void setOtrosDatos(String otrosDatos) {
		this.otrosDatos = otrosDatos;
	}

	
	@Override
	public String toString() {
		return "Datos [nombre=" + nombre + ", telefono=" + telefono
				+ ", otrosDatos=" + otrosDatos + "]";
	}	

}
