package com.bookstore.adapter.interfaz;

import com.bookstore.business.interfaz.INegocioAlmacen;
import com.bookstore.business.interfaz.INegocioCatalogo;
import com.bookstore.business.interfaz.INegocioCliente;
import com.bookstore.business.interfaz.INegocioLibro;
import com.bookstore.business.interfaz.INegocioOferta;
import com.bookstore.business.interfaz.INegocioUsuario;

public interface INegocioAdapter {

	public INegocioAlmacen getINegocioAlmacen();
	
	public INegocioCatalogo getINegocioCatalogo();
	
	public INegocioCliente getINegocioCliente();
	
	public INegocioLibro getINegocioLibro();
	
	public INegocioOferta getINegocioOferta();
	
	public INegocioUsuario getINegocioUsuario();

}
