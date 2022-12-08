package com.bookstore.factoria;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bookstore.crud.interfaz.ICRUDOferta;
import com.bookstore.config.Configuration;
import com.bookstore.enums.BookStoreEnum;
import com.bookstore.persistencia.OfertaDaoImpl;

public class FactoryOfertaDao {
	
	private String tipoDao;
	private JdbcTemplate jdbcTemplate;
	
	public void setTipoDao(Configuration typeBD){
		this.tipoDao = typeBD.getTypeDB();		
	}	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public ICRUDOferta getOfertaDao(){
		ICRUDOferta oferta = null;
		
		if(tipoDao.equals(BookStoreEnum.ENUM_MYSQL)){
			oferta = new OfertaDaoImpl(jdbcTemplate);
		}
		return oferta;
	}
}
