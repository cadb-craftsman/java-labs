package com.bookstore.mbeans;

import java.util.ArrayList;
import java.util.List;

import com.bookstore.adapter.interfaz.INegocioAdapter;
import com.bookstore.bbeans.BB_LibrosList;
import com.bookstore.jbeans.JB_Catalogo;
import com.bookstore.jbeans.JB_Libro;

public class MB_Categorias {
	
	private static String NAVEGACION_CATEGORIAS = "Categorias.jsf";
	private static String CIENCIAS_COMPUTACIONALES = "Ciencias Computacionales";
	private static String CIENCIAS_ECONOMICAS = "Ciencias Economicas";
	private static String CIENCIAS_HUMANAS = "Ciencias Humanas";
	private static String DERECHO_LEYES = "Derecho y Leyes";
	private static String LITERATURA = "Literatura";
		
	private BB_LibrosList bbCategorias;
	private INegocioAdapter negocioAdapter;
	private String criterio;

	public INegocioAdapter getNegocioAdapter() {
		return negocioAdapter;
	}

	public void setNegocioAdapter(INegocioAdapter negocioAdapter) {
		this.negocioAdapter = negocioAdapter;
	}

	public BB_LibrosList getBbCategorias() {
		return bbCategorias;
	}

	public void setBbCategorias(BB_LibrosList bbCategorias) {		
		this.bbCategorias = bbCategorias;
	}
	
	public String getCriterio() {
		return criterio;
	}

	public void setCriterio(String criterio) {
		this.criterio = criterio;
	}

	public String ejecutarCategoriaCC(){
		this.bbCategorias.setLibroList(ejecutarBusqueda(CIENCIAS_COMPUTACIONALES));
		ejecutarPaginacion();
		criterio = CIENCIAS_COMPUTACIONALES;
		return NAVEGACION_CATEGORIAS;
	}

	public String ejecutarCategoriaCE(){
		this.bbCategorias.setLibroList(ejecutarBusqueda(CIENCIAS_ECONOMICAS));
		ejecutarPaginacion();
		criterio = CIENCIAS_ECONOMICAS;
		return NAVEGACION_CATEGORIAS;
	}	
	
	public String ejecutarCategoriaCH(){
		this.bbCategorias.setLibroList(ejecutarBusqueda(CIENCIAS_HUMANAS));	
		ejecutarPaginacion();
		criterio = CIENCIAS_HUMANAS;
		return NAVEGACION_CATEGORIAS;
	}	

	public String ejecutarCategoriaDL(){
		this.bbCategorias.setLibroList(ejecutarBusqueda(DERECHO_LEYES));
		ejecutarPaginacion();
		criterio = DERECHO_LEYES;
		return NAVEGACION_CATEGORIAS;
	}	

	public String ejecutarCategoriaL(){
		this.bbCategorias.setLibroList(ejecutarBusqueda(LITERATURA));	
		ejecutarPaginacion();
		criterio = LITERATURA;
		return NAVEGACION_CATEGORIAS;
	}	
	
	private void ejecutarPaginacion(){
		if(bbCategorias.getLibroList().size() < 4){
			bbCategorias.setPaginacion(false);
		}else{
			bbCategorias.setPaginacion(true);
		}		
	}
	
	private List<JB_Libro> ejecutarBusqueda(String tipoBusqueda){
		List<JB_Libro> libroList = null;
		JB_Catalogo catalogo = new JB_Catalogo();
		catalogo.setCategoria(tipoBusqueda);
		List<JB_Catalogo> catalogoList = negocioAdapter.getINegocioCatalogo().buscarCatalogo(catalogo);
		if(catalogoList != null){
			libroList = new ArrayList<JB_Libro>();
			for (JB_Catalogo jbCatalogo : catalogoList) {
				JB_Libro jbLibro = new JB_Libro();
				jbLibro.setIsbn(jbCatalogo.getIsbn());
				libroList.addAll(negocioAdapter.getINegocioLibro().buscarLibro(jbLibro));				
			}
		}
		return libroList;
	}
}
