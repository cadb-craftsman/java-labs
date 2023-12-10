package com.craftsman.training.arraylist;

public class Persona {

	private int edad;
	private int dni;
	private String nombre;
	private String apellidos;

	public Persona(int edad, int dni, String nombre, String apellidos) {
		super();
		this.edad = edad;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void imprimirValores() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", dni=" + dni + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + "]";
	}

}
