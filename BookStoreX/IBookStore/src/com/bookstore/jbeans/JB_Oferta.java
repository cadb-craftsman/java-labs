package com.bookstore.jbeans;

import java.util.ArrayList;
import java.util.List;

public class JB_Oferta {

	private int idOferta;
	private String marcaOferta;
	private String isbn;
	private int idAlmacen;
	private List<JB_Libro> librosList = null;
		
	public JB_Oferta() {

	}

	public JB_Oferta(int idOferta, String marcaOferta, String isbn,
			int idAlmacen) {
		super();
		this.idOferta = idOferta;
		this.marcaOferta = marcaOferta;
		this.isbn = isbn;
		this.idAlmacen = idAlmacen;
	}

	public int getIdOferta() {
		return idOferta;
	}

	public void setIdOferta(int idOferta) {
		this.idOferta = idOferta;
	}

	public String getMarcaOferta() {
		return marcaOferta;
	}

	public void setMarcaOferta(String marcaOferta) {
		this.marcaOferta = marcaOferta;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getIdAlmacen() {
		return idAlmacen;
	}

	public void setIdAlmacen(int idAlmacen) {
		this.idAlmacen = idAlmacen;
	}

	public List<JB_Libro> getLibrosList() {
		return librosList;
	}

	public void setLibrosList(JB_Libro libro) {
		if(librosList == null){
			librosList = new ArrayList<JB_Libro>();
		}
		librosList.add(libro);
	}

	@Override
	public String toString() {
		return "JB_Oferta [idOferta=" + idOferta + ", marcaOferta="
				+ marcaOferta + ", isbn=" + isbn + ", idAlmacen=" + idAlmacen
				+ ", librosList=" + librosList + "]";
	}

}
