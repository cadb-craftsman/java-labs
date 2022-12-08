package com.craftsman.training.gherencia;

public class Persona {

	private String nombre;
	private int edad;
	private String direccion;

	public Persona() {
		super();
	}

	public Persona(Persona p) {
		this.nombre = p.nombre;
		this.edad = p.edad;
		this.direccion = p.direccion;		
	}

	public Persona(String nombre, int edad, String direccion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", direccion="
				+ direccion + "]";
	}

}
