package com.bookstore.business.interfaz;

import java.util.List;

import com.bookstore.jbeans.JB_Oferta;

public interface INegocioOferta {

	public List<JB_Oferta> buscarOferta(JB_Oferta oferta);

}
