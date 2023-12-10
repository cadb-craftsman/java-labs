/* 
   
 */
package com.bookstore.factoria;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bookstore.crud.interfaz.ICRUDLibro;
import com.bookstore.config.Configuration;
import com.bookstore.enums.BookStoreEnum;
import com.bookstore.persistencia.LibroDaoImpl;

public class FactoryLibroDao {
	
	private String tipoDao;
	private JdbcTemplate jdbcTemplate;
	
	public void setTipoDao(Configuration typeBD){
		this.tipoDao = typeBD.getTypeDB();		
	}	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}
	
    public ICRUDLibro getLibroDao() {
    	ICRUDLibro libro = null;
    	if (tipoDao.equals(BookStoreEnum.ENUM_MYSQL)) {
			libro = new LibroDaoImpl(jdbcTemplate);
		}
    	return libro;
    }


}
