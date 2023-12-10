package com.craftsman.training.gestion.empleado;

public class Empleado {

	private int codigo;
	private String nombre;
	private String fechaEntrada;
	private float salario;
	private String categoria;

	public Empleado() {
		super();		
	}

	public Empleado(int codigo, String nombre, String fechaEntrada,
			float salario, String categoria) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.fechaEntrada = fechaEntrada;
		this.salario = salario;
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", nombre=" + nombre
				+ ", fechaEntrada=" + fechaEntrada + ", salario=" + salario
				+ ", categoria=" + categoria + "]";
	}

}
