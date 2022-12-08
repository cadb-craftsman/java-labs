/* 
   
 */
package com.bookstore.persistencia;

import java.util.List;
import com.bookstore.jbeans.JB_Catalogo;
import com.bookstore.mapper.CatalogoRowMapper;
import com.bookstore.crud.interfaz.ICRUDCatalogo;

import org.springframework.jdbc.core.JdbcTemplate;

public class CatalogoDaoImpl implements ICRUDCatalogo{

	private JdbcTemplate jdbcTemplate;
	
	private String INSERT_QUERY = "insert into catalogo (idCatalogo, isbn, categoria, genero) values(?, ?, ?, ?)"; 
	private String SELECT_QUERY = "select idCatalogo, isbn, categoria, genero from catalogo where ((idCatalogo = ?) and (isbn = ?))";
	private String SELECT_QUERY_GENERICA = "select idCatalogo, isbn, categoria, genero from catalogo where (categoria like ?)";
	private String DELETE_QUERY = "delete from catalogo where ((idCatalogo = ?) and (isbn = ?))";
	private String UPDATE_QUERY = "update catalogo set (idCatalogo = ?, isbn = ?, categoria = ?, genero = ?) where ((idCatalogo = ?) and (isbn = ?))";
	
	public CatalogoDaoImpl() {
		super();
	}

	public CatalogoDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertarCatalogo(JB_Catalogo catalogo) {
		jdbcTemplate.update(INSERT_QUERY, new Object []{catalogo.getIdCatalogo(), catalogo.getIsbn(), catalogo.getCategoria(), catalogo.getGenero()});		
	}

	@Override
	public void eliminarCatalogo(JB_Catalogo catalogo) {
		jdbcTemplate.update(DELETE_QUERY, new Object [] {catalogo.getIdCatalogo(), catalogo.getIsbn()});
	}

	@Override
	public List<JB_Catalogo> consultarCatalogo(JB_Catalogo catalogo) {
		List<JB_Catalogo> lCatalogo = null; 
		if(catalogo.getIdCatalogo() != 0){
			lCatalogo = jdbcTemplate.query(SELECT_QUERY, new Object []{catalogo.getIdCatalogo(), catalogo.getIsbn()}, new CatalogoRowMapper());						
		}else{
			lCatalogo = jdbcTemplate.query(SELECT_QUERY_GENERICA, new Object []{catalogo.getCategoria()}, new CatalogoRowMapper());
		}	
		return lCatalogo;
	}

	@Override
	public void actualizarCatalogo(JB_Catalogo catalogo) {
		jdbcTemplate.update(UPDATE_QUERY, new Object [] {catalogo.getIdCatalogo(), catalogo.getIsbn(), catalogo.getCategoria(), catalogo.getGenero()});
	}

}
