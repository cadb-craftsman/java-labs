/* 
   
 */
package com.bookstore.factoria;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bookstore.crud.interfaz.ICRUDAutor;
import com.bookstore.config.Configuration;
import com.bookstore.enums.BookStoreEnum;
import com.bookstore.persistencia.AutorDaoImpl;

public class FactoryAutorDao {

	private String tipoDao;
	private JdbcTemplate jdbcTemplate;
	
	public void setTipoDao(Configuration typeBD){
		this.tipoDao = typeBD.getTypeDB();		
	}	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public ICRUDAutor getAutorDao() {
		ICRUDAutor autor = null;
		if (tipoDao.equals(BookStoreEnum.ENUM_MYSQL)) {
			autor = new AutorDaoImpl(jdbcTemplate);
		}
		return autor;
	}

}
