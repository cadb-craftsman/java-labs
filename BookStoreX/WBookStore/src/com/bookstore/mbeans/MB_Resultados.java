package com.bookstore.mbeans;

import java.util.List;

import com.bookstore.bbeans.BB_Busqueda;
import com.bookstore.bbeans.BB_LibrosList;
import com.bookstore.jbeans.JB_Libro;
import com.bookstore.adapter.interfaz.INegocioAdapter;

public class MB_Resultados {
	
	private static String NAVEGACION_RESULTADOS = "Resultados.jsf";
	
	private BB_Busqueda bbBusqueda;
	private BB_LibrosList bbLibros;
	private INegocioAdapter negocioAdapter;
		
	public MB_Resultados() {
		super();
	}

	public INegocioAdapter getNegocioAdapter() {
		return negocioAdapter;
	}

	public void setNegocioAdapter(INegocioAdapter negocioAdapter) {
		this.negocioAdapter = negocioAdapter;
	}	

	public BB_Busqueda getBbBusqueda() {
		return bbBusqueda;
	}

	public void setBbBusqueda(BB_Busqueda bbBusqueda) {
		this.bbBusqueda = bbBusqueda;		
	}

	public BB_LibrosList getBbLibros() {
		bbLibros.setLibroList(ejecutarBusqueda());
		if(bbLibros.getLibroList().size() < 4){
			bbLibros.setPaginacion(false);
		}else{
			bbLibros.setPaginacion(true);
		}
		return bbLibros;
	}
	
	public void setBbLibros(BB_LibrosList bbLibros) {
		this.bbLibros = bbLibros;		
	}	
		
	public List<JB_Libro> ejecutarBusqueda(){
		JB_Libro libro = new JB_Libro();

		libro.setTitulo(bbBusqueda.getTitulo());
		libro.setIsbn(bbBusqueda.getIsbn());
		libro.setEditorial(bbBusqueda.getEditorial());
		libro.setCategoria(bbBusqueda.getCategoria());
		libro.setGenerico(bbBusqueda.getPalabra());
		
		List<JB_Libro> librosList = negocioAdapter.getINegocioLibro().buscarLibroAutor(libro);
		return librosList;		
	}
	
	public String ejecutarBusquedaNavegacion(){
		return NAVEGACION_RESULTADOS;
	}
	
}
