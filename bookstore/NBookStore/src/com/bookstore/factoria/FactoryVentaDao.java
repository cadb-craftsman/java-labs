/* 
   
 */
package com.bookstore.factoria;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bookstore.crud.interfaz.ICRUDVenta;
import com.bookstore.config.Configuration;
import com.bookstore.enums.BookStoreEnum;
import com.bookstore.persistencia.VentaDaoImpl;

public class FactoryVentaDao {

	private String tipoDao;
	private JdbcTemplate jdbcTemplate;
	
	public void setTipoDao(Configuration typeBD){
		this.tipoDao = typeBD.getTypeDB();		
	}	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}   
	
	public ICRUDVenta getVentaDao() {
    	ICRUDVenta venta = null;
    	if (tipoDao.equals(BookStoreEnum.ENUM_MYSQL)) {
			venta = new VentaDaoImpl(jdbcTemplate);
		}
    	return venta;
    }


}
