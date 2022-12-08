package com.bookstore.jbeans;

public class JB_Venta {

	private int idVenta = 0;
	private String isbn = null;
	private int idCliente = 0;
	private int cantidad = 0;
	private String observaciones = null;

	public JB_Venta() {
		super();		
	}

	public JB_Venta(int idVenta, String isbn, int idCliente, int cantidad,
			String observaciones) {
		super();
		this.idVenta = idVenta;
		this.isbn = isbn;
		this.idCliente = idCliente;
		this.cantidad = cantidad;
		this.observaciones = observaciones;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "JB_Venta [idVenta=" + idVenta + ", isbn=" + isbn
				+ ", idCliente=" + idCliente + ", cantidad=" + cantidad
				+ ", observaciones=" + observaciones + "]";
	}

}
