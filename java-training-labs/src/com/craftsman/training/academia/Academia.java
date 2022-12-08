package com.craftsman.training.academia;

public class Academia {

	private String nombre;
	private String ubicacion;

	public Academia() {
		super();
	}

	public Academia(String nombre, String ubicacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "Academia [nombre=" + nombre + ", ubicacion=" + ubicacion + "]";
	}

}