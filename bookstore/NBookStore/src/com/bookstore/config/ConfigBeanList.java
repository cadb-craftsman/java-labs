package com.bookstore.config;

public class ConfigBeanList {
	 
	private String [] beanGestionList = {"cfg/gestionBean.xml"};
	private String [] beanList = {"cfg/almacenBean.xml","cfg/autorBean.xml","cfg/catalogoBean.xml", "cfg/clienteBean.xml",
								  "cfg/libroBean.xml", "cfg/ofertaBean.xml","cfg/usuarioBean.xml", "cfg/ventaBean.xml"};

	public String[] getBeanList() {
		return beanList;
	}

	public String[] getBeanGestionList() {
		return beanGestionList;
	}
	
}
