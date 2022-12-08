/* 
   
 */
package com.bookstore.factoria;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bookstore.crud.interfaz.ICRUDAlmacen;
import com.bookstore.config.Configuration;
import com.bookstore.enums.BookStoreEnum;
import com.bookstore.persistencia.AlmacenDaoImpl;

public class FactoryAlmacenDao {

	private String tipoDao;
	private JdbcTemplate jdbcTemplate;
	
	public void setTipoDao(Configuration typeBD){
		this.tipoDao = typeBD.getTypeDB();		
	}	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}	
	
	public ICRUDAlmacen getAlmacenDao() {
    	ICRUDAlmacen almacen = null;    	
    	if (tipoDao.equals(BookStoreEnum.ENUM_MYSQL)) {
    		almacen = new AlmacenDaoImpl(jdbcTemplate);
		}    	
    	return almacen;
    }

}
