package com.bookstore.jbeans;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class JB_Libro {

	private String isbn;
	private String titulo;
	private String edicion;
	private GregorianCalendar añoEdicion;
	private String editorial;
	private String idioma;
	private String descripcion;
	private String generico;
	private String categoria;
	private String genero;
	private double precio = 0.0;
	private int cantidad  = 0;
	private List<JB_Autor> autoresList = null;	
	
	public JB_Libro() {
		super();
	}

	public JB_Libro(String isbn, String titulo, String edicion,
			Date añoEdicion, String editorial, String idioma,
			String descripcion, String categoria, String genero, double precio) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.edicion = edicion;
		this.añoEdicion = new GregorianCalendar();
		this.añoEdicion.setTime(añoEdicion);
		this.editorial = editorial;
		this.idioma = idioma;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.genero = genero;
		this.precio = precio;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public int getAñoEdicion() {
		return añoEdicion.get(DateFormat.YEAR_FIELD) ;
	}

	public void setAñoEdicion(Date añoEdicion) {
		this.añoEdicion = new GregorianCalendar();
		this.añoEdicion.setTime(añoEdicion);
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getGenerico() {
		return generico;
	}

	public void setGenerico(String generico) {
		this.generico = generico;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public List<JB_Autor> getAutoresList() {
		return autoresList;
	}

	public void setAutoresList(JB_Autor autor) {
		if(autoresList == null){
			autoresList = new ArrayList<JB_Autor>();
		}
		autoresList.add(autor);
	}

	@Override
	public String toString() {
		return "JB_Libro [isbn=" + isbn + ", titulo=" + titulo + ", edicion="
				+ edicion + ", añoEdicion=" + añoEdicion + ", editorial="
				+ editorial + ", idioma=" + idioma + ", descripcion="
				+ descripcion + ", generico=" + generico + ", categoria="
				+ categoria + ", genero=" + genero + ", precio=" + precio
				+ ", autoresList=" + autoresList + "]";
	}

}
