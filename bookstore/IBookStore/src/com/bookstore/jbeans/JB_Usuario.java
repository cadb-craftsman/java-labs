package com.bookstore.jbeans;

public class JB_Usuario {

	private int idUsuario = 0;
	private String usuario = null;
	private String password = null;
	private String email = null;
	private int idCliente = 0;

	public JB_Usuario() {
		super();		
	}

	public JB_Usuario(int idUsuario, String usuario, String password,
			String email, int idCliente) {
		super();
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.password = password;
		this.email = email;
		this.idCliente = idCliente;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "JB_Usuario [idUsuario=" + idUsuario + ", usuario=" + usuario
				+ ", password=" + password + ", email=" + email
				+ ", idCliente=" + idCliente + "]";
	}

}
