/* 
   
 */
package com.bookstore.factoria;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bookstore.crud.interfaz.ICRUDCliente;
import com.bookstore.config.Configuration;
import com.bookstore.enums.BookStoreEnum;
import com.bookstore.persistencia.ClienteDaoImpl;

public class FactoryClienteDao {

	private String tipoDao;
	private JdbcTemplate jdbcTemplate;
	
	public void setTipoDao(Configuration typeBD){
		this.tipoDao = typeBD.getTypeDB();		
	}	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}	
	
    public ICRUDCliente getClienteDao() {
    	ICRUDCliente cliente  = null;
    	if (tipoDao.equals(BookStoreEnum.ENUM_MYSQL)) {
			cliente = new ClienteDaoImpl(jdbcTemplate);
		}
    	return cliente;
    }


}
