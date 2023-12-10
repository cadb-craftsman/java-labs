package com.bookstore.adapter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bookstore.adapter.interfaz.INegocioAdapter;
import com.bookstore.business.interfaz.INegocioAlmacen;
import com.bookstore.business.interfaz.INegocioCatalogo;
import com.bookstore.business.interfaz.INegocioCliente;
import com.bookstore.business.interfaz.INegocioLibro;
import com.bookstore.business.interfaz.INegocioOferta;
import com.bookstore.business.interfaz.INegocioUsuario;

public class INegocioAdapterImpl implements INegocioAdapter {

	private ApplicationContext context = null;
	
	public INegocioAdapterImpl(){
		super();
	}
	
	public INegocioAdapterImpl(String [] configBeanList){
		super();
		context = new ClassPathXmlApplicationContext(configBeanList);
	}

	@Override
	public INegocioAlmacen getINegocioAlmacen() {		
		return (INegocioAlmacen) context.getBean("negocioAlmacen");
	}

	@Override
	public INegocioCatalogo getINegocioCatalogo() {		
		return (INegocioCatalogo) context.getBean("negocioCatalogo");
	}

	@Override
	public INegocioCliente getINegocioCliente() {		
		return (INegocioCliente) context.getBean("negocioCliente");
	}

	@Override
	public INegocioLibro getINegocioLibro() {		
		return (INegocioLibro) context.getBean("negocioLibro");
	}

	@Override
	public INegocioOferta getINegocioOferta() {				
		return (INegocioOferta) context.getBean("negocioOferta");
	}

	@Override
	public INegocioUsuario getINegocioUsuario() {		
		return (INegocioUsuario) context.getBean("negocioUsuario");
	}

}
