package com.bookstore.gestion;

import com.bookstore.adapter.interfaz.IFactoryAdapter;
import com.bookstore.business.INegocioAlmacenImpl;
import com.bookstore.business.INegocioCatalogoImpl;
import com.bookstore.business.INegocioClienteImpl;
import com.bookstore.business.INegocioLibroImpl;
import com.bookstore.business.INegocioOfertaImpl;
import com.bookstore.business.INegocioUsuarioImpl;
import com.bookstore.business.interfaz.INegocioAlmacen;
import com.bookstore.business.interfaz.INegocioCatalogo;
import com.bookstore.business.interfaz.INegocioCliente;
import com.bookstore.business.interfaz.INegocioLibro;
import com.bookstore.business.interfaz.INegocioOferta;
import com.bookstore.business.interfaz.INegocioUsuario;

public class GestionBeanAdapter {
	
	private IFactoryAdapter factoryAdapter;
	
	public void setFactoryAdapter(IFactoryAdapter factoryAdapter) {
		this.factoryAdapter = factoryAdapter;
	}
	
	public INegocioAlmacen getNegocioAlmacen(){
		return new INegocioAlmacenImpl(factoryAdapter);
	}
	
	public INegocioCatalogo getNegocioCatalogo() {
		return new INegocioCatalogoImpl(factoryAdapter);
	}	
	
	public INegocioCliente getNegocioCliente() {
		return new INegocioClienteImpl(factoryAdapter);
	}		
	
	public INegocioLibro getNegocioLibro() {
		return new INegocioLibroImpl(factoryAdapter);
	}	
	
	public INegocioOferta getNegocioOferta() {
		return new INegocioOfertaImpl(factoryAdapter);
	}

	public INegocioUsuario getNegocioUsuario() {
		return new INegocioUsuarioImpl(factoryAdapter);
	}	
}
