/* 
   
 */
package com.bookstore.persistencia;

import java.util.List;
import com.bookstore.jbeans.JB_Almacen;
import com.bookstore.mapper.AlmacenRowMapper;
import com.bookstore.crud.interfaz.ICRUDAlmacen;

import org.springframework.jdbc.core.JdbcTemplate;

public class AlmacenDaoImpl implements ICRUDAlmacen{

	private JdbcTemplate jdbcTemplate;
	
	private String INSERT_QUERY = "insert into almacen (idAlmacen, isbn, cantidad, precio, observaciones) values(?, ?, ?, ?, ?)"; 
	private String SELECT_QUERY = "select idAlmacen, isbn, cantidad, precio, observaciones from almacen where ((idAlmacen = ?) and (isbn = ?))"; 
	private String SELECT_QUERY_ALL = "select idAlmacen, isbn, cantidad, precio, observaciones from almacen ";
	private String DELETE_QUERY = "delete from almacen where((idAlmacen) and (isbn = ?))";
	private String UPDATE_QUERY = "update almacen set (idAlmacen = ?, isbn = ?, cantidad = ?, precio = ?, observaciones = ?) where((idAlmacen = ?) and (isbn = ?))";
	
	public AlmacenDaoImpl() {
		super();
	}

	public AlmacenDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertar(JB_Almacen almacen) {
		jdbcTemplate.update(INSERT_QUERY, new Object [] {almacen.getIdAlmacen(), almacen.getIsbn(), almacen.getCantidad(), almacen.getPrecio(), almacen.getObservaciones()});
	}

	@Override
	public void eliminar(JB_Almacen almacen) {
		jdbcTemplate.update(DELETE_QUERY, new Object [] {almacen.getIsbn()});
		
	}

	@Override
	public List<JB_Almacen> consultar(JB_Almacen almacen) {
		List<JB_Almacen> lAlmacen = null;
		if(almacen == null){
			lAlmacen = jdbcTemplate.query(SELECT_QUERY_ALL, new AlmacenRowMapper());
		}else{
			lAlmacen = jdbcTemplate.query(SELECT_QUERY, new AlmacenRowMapper());
		}
				
		return lAlmacen;
	}

	@Override
	public void actualizar(JB_Almacen almacen) {
		jdbcTemplate.update(UPDATE_QUERY, new Object [] {almacen.getIdAlmacen(), almacen.getIsbn()});
		
	}

}
