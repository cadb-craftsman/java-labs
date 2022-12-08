package com.craftsman.training.perito;

public class Partes {

	private int codigo;
	private String matricula;
	private String descripcion;
	private double precio;
	private Taller datosTaller;

	public Partes() {
		super();		
	}

	public Partes(int codigo, String matricula, String descripcion,
			double precio, Taller datosTaller) {
		super();
		this.codigo = codigo;
		this.matricula = matricula;
		this.descripcion = descripcion;
		this.precio = precio;
		this.datosTaller = datosTaller;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Taller getDatosTaller() {
		return datosTaller;
	}

	public void setDatosTaller(Taller datosTaller) {
		this.datosTaller = datosTaller;
	}

	@Override
	public String toString() {
		return "Partes [codigo=" + codigo + ", matricula=" + matricula
				+ ", descripcion=" + descripcion + ", precio=" + precio
				+ ", datosTaller=" + datosTaller.toString() + "]";
	}
}
