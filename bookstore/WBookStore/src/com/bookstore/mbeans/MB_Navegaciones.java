package com.bookstore.mbeans;

import java.io.Serializable;

public class MB_Navegaciones implements Serializable {

	private static final long serialVersionUID = 1L;
	private String NAVEGACION_INICIO = "Inicio.jsf";
	private String NAVEGACION_OFERTAS = "Ofertas.jsf";
	private String NAVEGACION_CLIENTES = "Clientes.jsf";
	private String NAVEGACION_BUSQUEDA = "Busqueda.jsf";
	private String NAVEGACION_NOVEDADES = "Novedades.jsf";
	private String NAVEGACION_CATEGORIAS = "Categorias.jsf";
	private String NAVEGACION_RECOMENDACIONES = "Recomendaciones.jsf";

	public String getNAVEGACION_INICIO() {
		return NAVEGACION_INICIO;
	}

	public String getNAVEGACION_OFERTAS() {
		return NAVEGACION_OFERTAS;
	}

	public String getNAVEGACION_CLIENTES() {
		return NAVEGACION_CLIENTES;
	}

	public String getNAVEGACION_BUSQUEDA() {
		return NAVEGACION_BUSQUEDA;
	}

	public String getNAVEGACION_NOVEDADES() {
		return NAVEGACION_NOVEDADES;
	}

	public String getNAVEGACION_CATEGORIAS() {
		return NAVEGACION_CATEGORIAS;
	}

	public String getNAVEGACION_RECOMENDACIONES() {
		return NAVEGACION_RECOMENDACIONES;
	}

}
