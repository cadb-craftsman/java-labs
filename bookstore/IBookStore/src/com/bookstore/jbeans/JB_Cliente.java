package com.bookstore.jbeans;

public class JB_Cliente {

	private String idCliente;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String direccion;
	private String poblacion;
	private String telefono;
	private String intereses;
	private String email;
	private int codigoPostal;

	public JB_Cliente() {
		super();
	}

	public JB_Cliente(String idCliente, String nombre, String apellidoPaterno,
			String apellidoMaterno, String direccion, String poblacion,
			String telefono, String email, int codigoPostal, String intereses) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.direccion = direccion;
		this.poblacion = poblacion;
		this.telefono = telefono;
		this.intereses = intereses;
		this.email = email;
		this.codigoPostal = codigoPostal;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getIntereses() {
		return intereses;
	}

	public void setIntereses(String intereses) {
		this.intereses = intereses;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	@Override
	public String toString() {
		return "JB_Cliente [idCliente=" + idCliente + ", nombre=" + nombre
				+ ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno="
				+ apellidoMaterno + ", direccion=" + direccion + ", poblacion="
				+ poblacion + ", telefono=" + telefono + ", nif=" + intereses
				+ ", email=" + email + ", codigoPostal=" + codigoPostal + "]";
	}

}
