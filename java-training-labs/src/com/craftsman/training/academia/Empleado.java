package com.craftsman.training.academia;

public class Empleado {

	private String nombre;
	private String trabajo;

	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre, String trabajo) {
		this.nombre = nombre;
		this.trabajo = trabajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", trabajo=" + trabajo + "]";
	}

}