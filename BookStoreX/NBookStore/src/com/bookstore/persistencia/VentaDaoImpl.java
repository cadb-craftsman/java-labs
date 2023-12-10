/* 
   
 */
package com.bookstore.persistencia;

import java.util.List;
import com.bookstore.jbeans.JB_Venta;
import com.bookstore.mapper.VentaRowMapper;
import com.bookstore.crud.interfaz.ICRUDVenta;

import org.springframework.jdbc.core.JdbcTemplate;

public class VentaDaoImpl implements ICRUDVenta{

	private JdbcTemplate jdbcTemplate;
	
	private String INSERT_QUERY = "insert into venta (idVenta, isbn, idCliente, cantidad, observaciones) values(?, ?, ?, ?, ?)"; 
	private String SELECT_QUERY = "select idVenta, isbn, idCliente, cantidad, observaciones from venta where ((idVenta = ?) and (isbn = ?) and (idCliente = ?))"; 
	private String DELETE_QUERY = "delete from venta where (idVenta = ?)";
	private String UPDATE_QUERY = "update venta set (idVenta = ?, isbn = ?, idCliente = ?, cantidad = ?, observaciones = ?) where((idVenta = ?) and (isbn = ?) and (idCliente = ?))";
	
	public VentaDaoImpl() {
		super();
	}

	public VentaDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertarVenta(JB_Venta venta) {
		jdbcTemplate.update(INSERT_QUERY, new Object[]{venta.getIdVenta(), venta.getIsbn(), venta.getIdCliente(), venta.getCantidad(), venta.getObservaciones()});
	}

	@Override
	public void eliminarVenta(JB_Venta venta) {
		jdbcTemplate.update(DELETE_QUERY, venta.getIdVenta(), venta.getIsbn(), venta.getIdCliente());
	}

	@Override
	public List<JB_Venta> consltarVenta(JB_Venta venta) {
		List<JB_Venta> lVenta = jdbcTemplate.query(SELECT_QUERY, new Object[]{venta.getIdVenta(), venta.getIsbn(), venta.getIdCliente()}, new VentaRowMapper());
		return lVenta;
	}

	@Override
	public void actualizarVenta(JB_Venta venta) {
		jdbcTemplate.update(UPDATE_QUERY, new Object[]{venta.getIdVenta(), venta.getIsbn(), venta.getIdCliente(), venta.getCantidad(), venta.getObservaciones()});
		
	}
}
