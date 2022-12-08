package com.bookstore.jbeans;

public class JB_Almacen {

	private int idAlmacen = 0;
	private String isbn = null;
	private int cantidad = 0;
	private double precio = 0.0;
	private String observaciones = null;

	public JB_Almacen() {
		super();
	}

	public JB_Almacen(int idAlmacen, String isbn, int cantidad, double precio,
			String observaciones) {
		super();
		this.idAlmacen = idAlmacen;
		this.isbn = isbn;
		this.cantidad = cantidad;
		this.precio = precio;
		this.observaciones = observaciones;
	}

	public int getIdAlmacen() {
		return idAlmacen;
	}

	public void setIdAlmacen(int idAlmacen) {
		this.idAlmacen = idAlmacen;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "JB_Almacen [idAlmacen=" + idAlmacen + ", isbn=" + isbn
				+ ", cantidad=" + cantidad + ", precio=" + precio
				+ ", observaciones=" + observaciones + "]";
	}

}
