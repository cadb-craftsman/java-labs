package com.bookstore.gestion;

import com.bookstore.adapter.INegocioAdapterImpl;
import com.bookstore.adapter.interfaz.INegocioAdapter;
import com.bookstore.config.ConfigBeanList;

public class GestionNegocioAdapter {

	private ConfigBeanList configBeanList;
	private INegocioAdapter negocioAdapter;

	public void setConfigBeanList(ConfigBeanList configBeanList) {
		this.configBeanList = configBeanList;
	}

	public INegocioAdapter getINegocioAdapter(){		
		negocioAdapter = new INegocioAdapterImpl(configBeanList.getBeanGestionList());		
		return negocioAdapter;
	}
	
}
