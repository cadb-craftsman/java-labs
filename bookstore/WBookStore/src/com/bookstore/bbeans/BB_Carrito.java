package com.bookstore.bbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.bookstore.jbeans.JB_Libro;

public class BB_Carrito implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<JB_Libro> carritoListado = null;
	private JB_Libro libroSeleccionado;
		
	public BB_Carrito(){
		super();
	}
	
	public List<JB_Libro> getCarritoListado() {
		return carritoListado;
	}

	public void setCarritoListado(JB_Libro libro) {
		if(this.carritoListado  == null){
			this.carritoListado = new ArrayList<JB_Libro>();
		}
		if(carritoListado.size() > 0){
			for (int i = 0;  i < carritoListado.size(); i++) {				
				if (!(carritoListado.get(i).getIsbn().equals(libro.getIsbn()))) {
					this.carritoListado.add(libro);
					break;
				}
			}
		}else{
			this.carritoListado.add(libro);
		}		
	}

	public JB_Libro getLibroSeleccionado() {
		return libroSeleccionado;
	}

	public void setLibroSeleccionado(JB_Libro libroSeleccionado) {
		this.libroSeleccionado = libroSeleccionado;
	}
	
}
