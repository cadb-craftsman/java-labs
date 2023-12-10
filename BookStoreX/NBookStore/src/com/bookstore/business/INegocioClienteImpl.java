package com.bookstore.business;

import java.util.List;

import com.bookstore.adapter.interfaz.IFactoryAdapter;
import com.bookstore.business.interfaz.INegocioCliente;
import com.bookstore.jbeans.JB_Cliente;

public class INegocioClienteImpl implements INegocioCliente {

	private IFactoryAdapter factoryAdapter;

	public INegocioClienteImpl() {
		super();
	}

	public INegocioClienteImpl(IFactoryAdapter factoryAdapter) {
		super();
		this.factoryAdapter = factoryAdapter;
	}

	@Override
	public int insertarCliente(JB_Cliente cliente) {
		int r = factoryAdapter.getICRUDCliente().insertarCliente(cliente);		
		return r;
	}

	@Override
	public List<JB_Cliente> consultarCliente(JB_Cliente cliente) {
		List<JB_Cliente> clientesList = factoryAdapter.getICRUDCliente().consultarCliente(cliente);
		return clientesList;
	}

	@Override
	public int consultarNumeroClientes() {
		
		return 0;
	}

}
