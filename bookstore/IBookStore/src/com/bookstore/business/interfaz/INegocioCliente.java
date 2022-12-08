package com.bookstore.business.interfaz;

import java.util.List;

import com.bookstore.jbeans.JB_Cliente;


public interface INegocioCliente {

	public int insertarCliente(JB_Cliente cliente);
	public List<JB_Cliente> consultarCliente(JB_Cliente cliente);
	public int consultarNumeroClientes();
	
}
