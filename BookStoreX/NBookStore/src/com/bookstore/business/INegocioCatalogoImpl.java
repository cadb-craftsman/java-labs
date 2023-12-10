package com.bookstore.business;

import java.util.List;

import com.bookstore.adapter.interfaz.IFactoryAdapter;
import com.bookstore.business.interfaz.INegocioCatalogo;
import com.bookstore.jbeans.JB_Catalogo;

public class INegocioCatalogoImpl implements INegocioCatalogo {

	private IFactoryAdapter factoryAdapter;

	public INegocioCatalogoImpl() {
		super();
	}

	public INegocioCatalogoImpl(IFactoryAdapter factoryAdapter) {
		super();
		this.factoryAdapter = factoryAdapter;
	}

	@Override
	public List<JB_Catalogo> buscarCatalogo(JB_Catalogo catalogo) {
		List<JB_Catalogo> catalogoList = factoryAdapter.getICRUDCatalogo().consultarCatalogo(catalogo);				
		return catalogoList;
	}	
}