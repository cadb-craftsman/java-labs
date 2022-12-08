package com.bookstore.mbeans;

import java.util.ArrayList;
import java.util.List;

import com.bookstore.adapter.interfaz.INegocioAdapter;
import com.bookstore.bbeans.BB_LibrosList;
import com.bookstore.jbeans.JB_Libro;
import com.bookstore.jbeans.JB_Oferta;

public class MB_LOfertasNovedades {

	private static final String OFERTAS = "O";
	private static final String NOVEDADES = "N";
	private static final String RECOMENDACIONES = "R";
	
	private INegocioAdapter negocioAdapter;
	private BB_LibrosList bbOfertas;
	private BB_LibrosList bbNovedades;
	private BB_LibrosList bbRecomendaciones;

	public INegocioAdapter getNegocioAdapter() {
		return negocioAdapter;
	}

	public void setNegocioAdapter(INegocioAdapter negocioAdapter) {
		this.negocioAdapter = negocioAdapter;
	}

	public BB_LibrosList getBbOfertas() {
		return bbOfertas;
	}

	public void setBbOfertas(BB_LibrosList bbOfertas) {
		this.bbOfertas = bbOfertas;
		this.bbOfertas.setLibroList(ejecutarBusqueda(OFERTAS));
		if (this.bbOfertas.getLibroList().size() < 4) {
			this.bbOfertas.setPaginacion(false);
		}else{
			this.bbOfertas.setPaginacion(true);
		}
	}

	public BB_LibrosList getBbNovedades() {
		return bbNovedades;
	}

	public void setBbNovedades(BB_LibrosList bbNovedades) {
		this.bbNovedades = bbNovedades;
		this.bbNovedades.setLibroList(ejecutarBusqueda(NOVEDADES));
		if (this.bbOfertas.getLibroList().size() < 4) {
			this.bbOfertas.setPaginacion(false);
		}else{
			this.bbOfertas.setPaginacion(true);
		}
	}

	public BB_LibrosList getBbRecomendaciones() {
		return bbRecomendaciones;
	}

	public void setBbRecomendaciones(BB_LibrosList bbRecomendaciones) {
		this.bbRecomendaciones = bbRecomendaciones;
		this.bbRecomendaciones.setLibroList(ejecutarBusqueda(RECOMENDACIONES));
		if (this.bbRecomendaciones.getLibroList().size() < 4) {
			this.bbRecomendaciones.setPaginacion(false);
		}else{
			this.bbRecomendaciones.setPaginacion(true);
		}

	}

	private List<JB_Libro> ejecutarBusqueda(String tipoBusqueda){
		List<JB_Libro> libroList = null;
		JB_Oferta oferta = new JB_Oferta();
		oferta.setMarcaOferta(tipoBusqueda);
		List<JB_Oferta> ofertaList = negocioAdapter.getINegocioOferta().buscarOferta(oferta);
		if(ofertaList != null){
			libroList = new ArrayList<JB_Libro>();
			for (JB_Oferta jbOferta : ofertaList) {
				JB_Libro jbLibro = new JB_Libro();
				jbLibro.setIsbn(jbOferta.getIsbn());
				libroList.addAll(negocioAdapter.getINegocioLibro().buscarLibro(jbLibro));				
			}
		}
		return libroList;
	}
}
