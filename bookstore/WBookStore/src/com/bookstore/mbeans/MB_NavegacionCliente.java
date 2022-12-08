package com.bookstore.mbeans;

import com.bookstore.adapter.interfaz.INegocioAdapter;
import com.bookstore.bbeans.BB_Cliente;
import com.bookstore.jbeans.JB_Cliente;

public class MB_NavegacionCliente {

	private BB_Cliente bbCliente;
	private INegocioAdapter negocioAdapter;
	
	public MB_NavegacionCliente(){
		super();
	}	

	public BB_Cliente getBbCliente() {
		return bbCliente;
	}

	public void setBbCliente(BB_Cliente bbCliente) {
		this.bbCliente = bbCliente;
	}
	
	public INegocioAdapter getNegocioAdapter() {
		return negocioAdapter;
	}

	public void setNegocioAdapter(INegocioAdapter negocioAdapter) {
		this.negocioAdapter = negocioAdapter;
	}

	public void insertarCliente(){
		JB_Cliente cliente = new JB_Cliente();
				
		cliente.setIdCliente(bbCliente.getIdCliente());
		cliente.setNombre(bbCliente.getNombre());
		cliente.setApellidoPaterno(bbCliente.getApellidoPaterno());
		cliente.setApellidoMaterno(bbCliente.getApellidoMaterno());
		cliente.setDireccion(bbCliente.getDireccion());
		cliente.setPoblacion(bbCliente.getPoblacion());
		cliente.setTelefono(bbCliente.getTelefono());
		cliente.setIntereses(bbCliente.getIntereses());
		cliente.setEmail(bbCliente.getEmail());
		cliente.setCodigoPostal(bbCliente.getCodigoPostal());
	
		negocioAdapter.getINegocioCliente().insertarCliente(cliente);	
		
	}
	
}
