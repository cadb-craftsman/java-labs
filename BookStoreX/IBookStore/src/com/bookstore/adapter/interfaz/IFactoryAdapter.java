package com.bookstore.adapter.interfaz;

import com.bookstore.crud.interfaz.ICRUDAlmacen;
import com.bookstore.crud.interfaz.ICRUDAutor;
import com.bookstore.crud.interfaz.ICRUDCatalogo;
import com.bookstore.crud.interfaz.ICRUDCliente;
import com.bookstore.crud.interfaz.ICRUDLibro;
import com.bookstore.crud.interfaz.ICRUDOferta;
import com.bookstore.crud.interfaz.ICRUDUsuario;
import com.bookstore.crud.interfaz.ICRUDVenta;

public interface IFactoryAdapter {

	public ICRUDAlmacen getICRUDAlmacen();
	
	public ICRUDAutor getICRUDAutor();	
	
	public ICRUDCatalogo getICRUDCatalogo();
	
	public ICRUDCliente getICRUDCliente();
	
	public ICRUDLibro getICRUDLibro();
		
	public ICRUDOferta getICRUDOferta();
	
	public ICRUDUsuario getICRUDUsuario();
	
	public ICRUDVenta getICRUDVenta();
		
}
