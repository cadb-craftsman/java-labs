package com.craftsman.training.arraylist;

import java.util.ArrayList;

public class GestionUsuarios {

	private ArrayList<Usuario> listaUsuarios;
	
	public GestionUsuarios() {
		super();
		listaUsuarios = new ArrayList<Usuario>();
	}
	
	public ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public void insertarUsuario(Usuario u){
		this.listaUsuarios.add(u);
	}
	
	public void listarUsuario(){
		for (int i = 0; i < this.listaUsuarios.size(); i++) {
			System.out.println(listaUsuarios.get(i).toString());	
		}
	}

	public boolean validarUsuario(Usuario u){
		boolean validacion = false;	
		
		for (int i = 0; i < listaUsuarios.size(); i++) {			
			if (listaUsuarios.get(i).toString().equals(u.toString())) {
				validacion = true;
				break;
			}else{
				validacion = false;
			}
		}
		return validacion;		
	}
}
