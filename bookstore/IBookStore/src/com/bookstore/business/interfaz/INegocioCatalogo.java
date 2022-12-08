package com.bookstore.business.interfaz;

import java.util.List;

import com.bookstore.jbeans.JB_Catalogo;

public interface INegocioCatalogo {

	public List<JB_Catalogo> buscarCatalogo(JB_Catalogo catalogo);
}
