package com.bookstore.mbeans;

import java.io.Serializable;
import com.bookstore.bbeans.BB_Carrito;

public class MB_Carrito implements Serializable {
	
	private static String NAVEGACION_COMPRAS = "Compras.jsf";
	private static String NAVEGACION_REALIZAR_COMPRA = "RealizarCompra.jsf";
	
	private static final long serialVersionUID = 1L;	
	private BB_Carrito bbCarrito;	
	private int cantidad;
	
	public MB_Carrito(){
		super();
	}
	
	public BB_Carrito getBbCarrito() {
		return bbCarrito;
	}

	public void setBbCarrito(BB_Carrito bbCarrito) {
		this.bbCarrito = bbCarrito;		
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String ejecutarCarritoCompras(){
		return NAVEGACION_COMPRAS;
	}
	
	public String ejecutarRealizarCompra(){
		return NAVEGACION_REALIZAR_COMPRA;
	}
	
	public String ejecutarNavegacionCompras(){
		bbCarrito.setCarritoListado(bbCarrito.getLibroSeleccionado());		
		return NAVEGACION_COMPRAS;
	}
	
	public String ejecutarEliminarCarrito(){
		for (int i = 0; i < bbCarrito.getCarritoListado().size(); i++) {
			if(bbCarrito.getLibroSeleccionado().getIsbn().equals(bbCarrito.getCarritoListado().get(i).getIsbn())){
				bbCarrito.getCarritoListado().remove(i);
			}
		}
		cantidad = bbCarrito.getCarritoListado().size();
		return NAVEGACION_COMPRAS;
	}

	public String ejecutarAgregarCarrito(){
		for (int i = 0; i < bbCarrito.getCarritoListado().size(); i++) {
			if(bbCarrito.getLibroSeleccionado().getIsbn().equals(bbCarrito.getCarritoListado().get(i).getIsbn())){
				bbCarrito.getCarritoListado().get(i).setCantidad(bbCarrito.getLibroSeleccionado().getCantidad());
			}
		}		
		cantidad = bbCarrito.getCarritoListado().size();		
		return NAVEGACION_COMPRAS;
	}
	
}

