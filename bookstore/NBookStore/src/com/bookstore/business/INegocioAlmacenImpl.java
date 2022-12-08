package com.bookstore.business;

import com.bookstore.adapter.interfaz.IFactoryAdapter;
import com.bookstore.business.interfaz.INegocioAlmacen;

public class INegocioAlmacenImpl implements INegocioAlmacen {

	private IFactoryAdapter factoryAdapter;

	public INegocioAlmacenImpl() {
		super();		
	}

	public INegocioAlmacenImpl(IFactoryAdapter factoryAdapter) {
		super();
		this.factoryAdapter = factoryAdapter;
	}
	
}
