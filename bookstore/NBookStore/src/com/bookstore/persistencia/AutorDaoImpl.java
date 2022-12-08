/* 
   
 */
package com.bookstore.persistencia;

import java.util.List;
import com.bookstore.jbeans.JB_Autor;
import com.bookstore.mapper.AutorRowMapper;
import com.bookstore.crud.interfaz.ICRUDAutor;

import org.springframework.jdbc.core.JdbcTemplate;

public class AutorDaoImpl implements ICRUDAutor{

	private static String VOID = ""; 
	private static String PERCENT = "%";
	private JdbcTemplate jdbcTemplate;
	
	private String INSERT_QUERY = "insert into autores (idAutor, isbn, nombre, apellidoPaterno, apellidoMaterno) values(?, ?, ?, ?, ?)";	
	private String SELECT_QUERY = "select idAutor, isbn, nombre, apellidoPaterno, apellidoMaterno from autores where (isbn = ?)";
	private String SELECT_QUERY_GENERICA = "select idAutor, isbn, nombre, apellidoPaterno, apellidoMaterno from autores where (((nombre like ?) or (apellidoPaterno like ?) or (apellidoMaterno like ?)))";
	private String DELETE_QUERY = "delete from autores where (isbn = ?)";
	private String UPDATE_QUERY = "update autores set (idAutor = ?, isbn = ?, nombre = ?, apellidoPaterno = ?, apellidoMaterno = ?) where((idAutor = ?) and (isbn = ?))";
			
	public AutorDaoImpl() {
		super();
	}

	public AutorDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertarAutor(JB_Autor autor) {
		jdbcTemplate.update(INSERT_QUERY, new Object [] {autor.getIdAutor(), autor.getIsbn(), autor.getNombre(), autor.getApellidoPaterno(), autor.getApellidoMaterno()});		
	}

	@Override
	public void eliminarAutor(JB_Autor autor) {
		jdbcTemplate.update(DELETE_QUERY, new Object [] {autor.getIsbn()});		
	}

	@Override
	public List<JB_Autor> consultarAutor(JB_Autor autor) {
		List<JB_Autor> lAutor = null;
		if((autor.getGenerico() != null) && (!autor.getGenerico().equals(VOID))){
			String busqueda = PERCENT+autor.getGenerico()+PERCENT;			
			lAutor =  jdbcTemplate.query(SELECT_QUERY_GENERICA, new Object[]{busqueda, busqueda, busqueda}, new AutorRowMapper());				
		}else{
			lAutor	= jdbcTemplate.query(SELECT_QUERY, new Object []{autor.getIsbn()}, new AutorRowMapper());
		}		 
		return lAutor;
	}

	@Override
	public void actualizarAutor(JB_Autor autor) {
		jdbcTemplate.update(UPDATE_QUERY, new Object [] {autor.getIdAutor(), autor.getIsbn()});		
	}

}
