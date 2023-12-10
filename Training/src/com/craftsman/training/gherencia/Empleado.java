package com.craftsman.training.gherencia;

public class Empleado extends Persona {

	private String categoria;
	private double salario;

	public Empleado() {
		super();
	}

	public Empleado(Empleado e) {
		super(e);
		this.categoria = e.categoria;
		this.salario = e.salario;
	}

	public Empleado(String categoria, double salario, Persona p) {
		super(p);
		this.categoria = categoria;
		this.salario = salario;
	}

	public void comprobarCategoria(Persona p) {
		if (this.categoria.equalsIgnoreCase("becario") && p.getEdad() < 25) {
			System.out.println("Es becario");
			this.salario = 800;
		}

	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {

		return "Empleado [categoria=" + categoria + ", salario=" + salario
				+ ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
				+ ", getDireccion()=" + getDireccion() + "]";
	}

}
