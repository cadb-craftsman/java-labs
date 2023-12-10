package com.craftsman.training.arraylist;

public class Usuario {

	private String usuario;
	private String password;

	public Usuario() {
		super();
	}

	public Usuario(String usuario, String password) {
		super();
		this.usuario = usuario;
		this.password = password;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String generarPassword(){
		String clave = "";
		String caracteres = "0123456789ZXCVBNMASDFGHJKLQWERTYUIOPzxcvbnmasdfghjklqwertyuiop";
		for (int i = 0; i < 5; i++) {
			clave += caracteres.charAt((int) (Math.random()*caracteres.length()));
		}		
		return clave;
	}
	
	@Override
	public String toString() {
		return "Usuario [usuario=" + usuario + ", password=" + password + "]";
	}	
}