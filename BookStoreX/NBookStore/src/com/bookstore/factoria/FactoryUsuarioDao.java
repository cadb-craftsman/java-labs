/* 
   
 */
package com.bookstore.factoria;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bookstore.crud.interfaz.ICRUDUsuario;
import com.bookstore.config.Configuration;
import com.bookstore.enums.BookStoreEnum;
import com.bookstore.persistencia.UsuarioDaoImpl;

public class FactoryUsuarioDao {

	private String tipoDao;
	private JdbcTemplate jdbcTemplate;
	
	public void setTipoDao(Configuration typeBD){
		this.tipoDao = typeBD.getTypeDB();		
	}	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}		

    public ICRUDUsuario getUsuarioDao() {
    	ICRUDUsuario usuario = null;
    	if (tipoDao.equals(BookStoreEnum.ENUM_MYSQL)) {
			usuario = new UsuarioDaoImpl(jdbcTemplate);
		}
    	return usuario;
    }


}
