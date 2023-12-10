package com.craftsman.training.academia;

public class Curso {

	private String nombre;
	private int codigo;
	private int horas;
		
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Curso(String nombre, int codigo, int horas) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.horas = horas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", codigo=" + codigo + ", horas=" + horas + "]";
	}
}