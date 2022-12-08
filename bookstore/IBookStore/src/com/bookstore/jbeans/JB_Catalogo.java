package com.bookstore.jbeans;

public class JB_Catalogo {

	private int idCatalogo = 0;
	private String isbn = null;
	private String categoria = null;
	private String genero = null;

	public JB_Catalogo() {
		super();
	}

	public JB_Catalogo(int idCatalogo, String isbn, String categoria, String genero) {
		super();
		this.idCatalogo = idCatalogo;
		this.isbn = isbn;
		this.categoria = categoria;
		this.genero = genero;
	}

	public int getIdCatalogo() {
		return idCatalogo;
	}

	public void setIdCatalogo(int idCatalogo) {
		this.idCatalogo = idCatalogo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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

	@Override
	public String toString() {
		return "JB_Catalogo [idCatalogo=" + idCatalogo + ", isbn=" + isbn
				+ ", categoria=" + categoria + ", genero=" + genero + "]";
	}
	
}
