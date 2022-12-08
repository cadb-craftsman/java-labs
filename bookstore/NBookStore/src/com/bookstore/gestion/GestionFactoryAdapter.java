package com.bookstore.gestion;

import com.bookstore.adapter.IFactoryAdaterImpl;
import com.bookstore.adapter.interfaz.IFactoryAdapter;
import com.bookstore.config.ConfigBeanList;

public class GestionFactoryAdapter {

	private ConfigBeanList configBeanList;
	
	public void setConfigBeanList(ConfigBeanList configBeanList) {
		this.configBeanList = configBeanList;
	}

	public IFactoryAdapter getIFactoryAdapter(){
		IFactoryAdapter factoryAdapter = null;		
		factoryAdapter = new IFactoryAdaterImpl(configBeanList.getBeanList());
		return factoryAdapter;
	}	
}
