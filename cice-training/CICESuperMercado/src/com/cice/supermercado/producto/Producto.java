package com.cice.supermercado.producto;

public class Producto {

	private String codigoProducto;
	private String nombreProducto;
	private String categoriaProducto;
	private double cantidadProducto;

	public Producto(String codigoProducto, String nombreProducto,
			String categoriaProducto, double cantidadProducto) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.categoriaProducto = categoriaProducto;
		this.cantidadProducto = cantidadProducto;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getCategoriaProducto() {
		return categoriaProducto;
	}

	public void setCategoriaProducto(String categoriaProducto) {
		this.categoriaProducto = categoriaProducto;
	}

	public double getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(double cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	@Override
	public String toString() {
		return "Producto [codigoProducto=" + codigoProducto
				+ ", nombreProducto=" + nombreProducto + ", categoriaProducto="
				+ categoriaProducto + ", cantidadProducto=" + cantidadProducto
				+ "]";
	}

}
