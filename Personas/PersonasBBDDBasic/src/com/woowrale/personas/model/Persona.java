package com.woowrale.personas.model;

public class Persona {
	
	private int id;
	private String nombre;
	private String apellidos;
	private String direccion;
	private Integer edad;
	private String email;

	public Persona() {
		super();
	}

	public Persona(String nombre, String apellidos, String direccion, Integer edad, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.edad = edad;
		this.email = email;
	}	

	public Persona(int id, String nombre, String apellidos, String direccion, Integer edad, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.edad = edad;
		this.email = email;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ ", edad=" + edad + ", email=" + email + "]";
	}
}
