package com.bookstore.persistencia;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bookstore.crud.interfaz.ICRUDOferta;
import com.bookstore.jbeans.JB_Oferta;
import com.bookstore.mapper.OfertaRowMapper;

public class OfertaDaoImpl implements ICRUDOferta {

	public static String VACIO = "";	
	
	private JdbcTemplate jdbcTemplate;
	
	private String INSERT_QUERY = "insert into ofertas (idOferta, isbn, idAlmacen, marcaOferta) values(?, ?, ?, ?)"; 
	private String SELECT_QUERY = "select idOferta, isbn, idAlmacen, marcaOferta from ofertas where ((idOferta = ?) and (isbn = ?) and (idAlmacen = ?) and (marcaOferta = ?))";	
	private String SELECT_QUERY_ALL = "select idOferta, isbn, idAlmacen, marcaOferta from ofertas where (marcaOferta = ?)";
	private String DELETE_QUERY = "delete from ofertas where ((idOferta = ?) and (isbn = ?) and (idAlmacen = ?))";
	private String UPDATE_QUERY = "update ofertas set (idOferta = ?, isbn = ?, idAlmacen = ?, marcaOferta = ?) where((idOferta = ?) and (isbn = ?) and (idAlmacen = ?) and (marcaOferta = ?))";
	
	public OfertaDaoImpl() {
		super();
	}

	public OfertaDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertarOferta(JB_Oferta oferta) {
		jdbcTemplate.update(INSERT_QUERY, new Object []{oferta.getIdOferta(), oferta.getIsbn(), oferta.getIdAlmacen(), oferta.getMarcaOferta()});
	}

	@Override
	public void eliminarOferta(JB_Oferta oferta) {
		jdbcTemplate.update(DELETE_QUERY, new Object []{oferta.getIdOferta(), oferta.getIsbn(), oferta.getIdAlmacen()});
	}

	@Override
	public List<JB_Oferta> consultarOferta(JB_Oferta oferta) {
		List<JB_Oferta> ofertaList = null;
		if(!oferta.getMarcaOferta().equals(VACIO)){
			ofertaList = jdbcTemplate.query(SELECT_QUERY_ALL, new Object[]{oferta.getMarcaOferta()},  new OfertaRowMapper());						
		}else{
			ofertaList = jdbcTemplate.query(SELECT_QUERY, new Object[]{oferta.getIdOferta(), oferta.getIsbn(), oferta.getIdAlmacen(), oferta.getMarcaOferta()}, new OfertaRowMapper());
		}		
		return ofertaList;
	}

	@Override
	public void actualizarOferta(JB_Oferta oferta) {
		jdbcTemplate.update(UPDATE_QUERY, new Object []{oferta.getIdOferta(), oferta.getIsbn(), oferta.getIdAlmacen(), oferta.getMarcaOferta()});
	}

}
