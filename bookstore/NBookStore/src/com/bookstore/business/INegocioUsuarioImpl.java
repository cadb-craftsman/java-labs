package com.bookstore.business;

import com.bookstore.adapter.interfaz.IFactoryAdapter;
import com.bookstore.business.interfaz.INegocioUsuario;

public class INegocioUsuarioImpl implements INegocioUsuario {

	private IFactoryAdapter factoryAdapter;

	public INegocioUsuarioImpl() {
		super();
	}

	public INegocioUsuarioImpl(IFactoryAdapter factoryAdapter) {
		super();
		this.factoryAdapter = factoryAdapter;
	}	

}
