package com.bookstore.bbeans;

import java.util.List;
import com.bookstore.jbeans.JB_Libro;

public class BB_LibrosList {
	
	private boolean paginacion;
	private List<JB_Libro> libroList;	
	private JB_Libro libroSeleccionado;
	
	public BB_LibrosList(){
		super();
	}
	
	public List<JB_Libro> getLibroList() {		
		return libroList;
	}

	public void setLibroList(List<JB_Libro> libroList) {
		this.libroList = libroList;
	}

	public boolean isPaginacion() {
		return paginacion;
	}

	public void setPaginacion(boolean paginacion) {
		this.paginacion = paginacion;
	}

	public JB_Libro getLibroSeleccionado() {
		return libroSeleccionado;
	}

	public void setLibroSeleccionado(JB_Libro libroSeleccionado) {
		this.libroSeleccionado = libroSeleccionado;
	}

	@Override
	public String toString() {
		return "BB_LibrosList [paginacion=" + paginacion + ", libroList="
				+ libroList + "]";
	}	
}
