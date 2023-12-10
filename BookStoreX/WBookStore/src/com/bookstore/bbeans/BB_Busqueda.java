package com.bookstore.bbeans;

public class BB_Busqueda {
	
	private String titulo;
	private String autor;
	private String isbn;
	private String editorial;
	private String categoria;
	private String palabra;
	
	public BB_Busqueda() {
		super();		
	}

	public BB_Busqueda(String titulo, String autor, String isbn,
			String editorial, String categoria, String palabra) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.editorial = editorial;
		this.categoria = categoria;
		this.palabra = palabra;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}	
	
	@Override
	public String toString() {
		return "BB_Busqueda [titulo=" + titulo + ", autor=" + autor + ", isbn="
				+ isbn + ", editorial=" + editorial + ", categoria="
				+ categoria + ", palabra=" + palabra + "]";
	}
	
}
