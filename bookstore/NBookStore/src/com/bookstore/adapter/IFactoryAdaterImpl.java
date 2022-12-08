package com.bookstore.adapter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bookstore.adapter.interfaz.IFactoryAdapter;
import com.bookstore.crud.interfaz.ICRUDAlmacen;
import com.bookstore.crud.interfaz.ICRUDAutor;
import com.bookstore.crud.interfaz.ICRUDCatalogo;
import com.bookstore.crud.interfaz.ICRUDCliente;
import com.bookstore.crud.interfaz.ICRUDLibro;
import com.bookstore.crud.interfaz.ICRUDOferta;
import com.bookstore.crud.interfaz.ICRUDUsuario;
import com.bookstore.crud.interfaz.ICRUDVenta;

public class IFactoryAdaterImpl implements IFactoryAdapter {
	 
	private ApplicationContext context = null;

	public IFactoryAdaterImpl(){
		super();
	}

	public IFactoryAdaterImpl(String [] configBeanList){
		super();
		context = new ClassPathXmlApplicationContext(configBeanList);
	}

	@Override
	public ICRUDAlmacen getICRUDAlmacen() {
		return (ICRUDAlmacen) context.getBean("almacenDao");
	}

	@Override
	public ICRUDAutor getICRUDAutor() {		
		return (ICRUDAutor) context.getBean("autorDao");
	}

	@Override
	public ICRUDCatalogo getICRUDCatalogo() {		
		return (ICRUDCatalogo) context.getBean("catalogoDao");
	}

	@Override
	public ICRUDCliente getICRUDCliente() {
		return (ICRUDCliente) context.getBean("clienteDao");
	}

	@Override
	public ICRUDLibro getICRUDLibro() {		
		return (ICRUDLibro) context.getBean("libroDao");
	}

	@Override
	public ICRUDOferta getICRUDOferta() {		
		return (ICRUDOferta) context.getBean("ofertaDao");
	}

	@Override
	public ICRUDUsuario getICRUDUsuario() {
		return (ICRUDUsuario) context.getBean("usuarioDao");
	}

	@Override
	public ICRUDVenta getICRUDVenta() {
		return (ICRUDVenta) context.getBean("ventaDao");
	}
	
}
