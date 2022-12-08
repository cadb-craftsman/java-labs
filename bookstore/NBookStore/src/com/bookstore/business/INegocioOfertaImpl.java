package com.bookstore.business;

import java.util.List;
import com.bookstore.adapter.interfaz.IFactoryAdapter;
import com.bookstore.business.interfaz.INegocioOferta;
import com.bookstore.jbeans.JB_Oferta;

public class INegocioOfertaImpl implements INegocioOferta {
	
	private IFactoryAdapter factoryAdapter;
	
	public INegocioOfertaImpl() {
		super();
	}

	public INegocioOfertaImpl(IFactoryAdapter factoryAdapter) {
		super();
		this.factoryAdapter = factoryAdapter;
	}

	@Override
	public List<JB_Oferta> buscarOferta(JB_Oferta oferta) {
		
		List<JB_Oferta> ofertasList = factoryAdapter.getICRUDOferta().consultarOferta(oferta);

		return ofertasList;
	}
	
}
