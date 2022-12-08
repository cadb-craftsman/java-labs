/* 
   
 */
package com.bookstore.factoria;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bookstore.crud.interfaz.ICRUDCatalogo;
import com.bookstore.config.Configuration;
import com.bookstore.enums.BookStoreEnum;
import com.bookstore.persistencia.CatalogoDaoImpl;

public class FactoryCatalogoDao {

	private String tipoDao;
	private JdbcTemplate jdbcTemplate;
	
	public void setTipoDao(Configuration typeBD){
		this.tipoDao = typeBD.getTypeDB();		
	}	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}
	
    public ICRUDCatalogo getCatalogoDao() {
    	ICRUDCatalogo catalogo = null;
    	if (tipoDao.equals(BookStoreEnum.ENUM_MYSQL)) {
			catalogo = new CatalogoDaoImpl(jdbcTemplate);
		}
    	return catalogo;
    }


}
