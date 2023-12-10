package com.bookstore.jbeans;

public class JB_Autor {

	private int idAutor;
	private String isbn;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String generico;

	public JB_Autor() {
		super();
	}

	public JB_Autor(int idAutor, String isbn, String nombre,
			String apellidoPaterno, String apellidoMaterno) {
		super();
		this.idAutor = idAutor;
		this.isbn = isbn;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
	}

	public int getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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

	public String getGenerico() {
		return generico;
	}

	public void setGenerico(String generico) {
		this.generico = generico;
	}

	@Override
	public String toString() {
		return  ""+ nombre + " " + apellidoPaterno 	+ " " + apellidoMaterno;
	}

}
