package com.craftsman.training.arraylist;

public class Producto {
	
	String nombre;
	int cantidad;
		
	public Producto(String nombre, int cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + "]";
	}
}
