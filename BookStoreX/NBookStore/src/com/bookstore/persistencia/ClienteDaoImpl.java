/* 
   
 */
package com.bookstore.persistencia;

import java.util.List;
import com.bookstore.jbeans.JB_Cliente;
import com.bookstore.mapper.ClienteRowMapper;
import com.bookstore.crud.interfaz.ICRUDCliente;

import org.springframework.jdbc.core.JdbcTemplate;

public class ClienteDaoImpl implements ICRUDCliente{

	private JdbcTemplate jdbcTemplate;
	
	private String INSERT_QUERY = "insert into clientes (idCliente, nombre, apellidoPaterno, apellidoMaterno, direccion, poblacion, telefono, email, codigoPostal, intereses) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; 
	private String SELECT_QUERY = "select idCliente, nombre, apellidoPaterno, apellidoMaterno, direccion, poblacion, telefono, email, codigoPostal, intereses from clientes where (idCliente = ?)"; 
	private String DELETE_QUERY = "delete from clientes where (idCliente = ?)";
	private String UPDATE_QUERY = "update clientes set (idCliente = ?, nombre = ?, apellidoPaterno = ?, apellidoMaterno = ?, direccion = ?, poblacion = ?, telefono = ?, email = ?, codigoPostal = ?, intereses = ?,) where( idCliente = ?)";
	
	public ClienteDaoImpl() {
		super();
	}

	public ClienteDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insertarCliente(JB_Cliente cliente) {
		return jdbcTemplate.update(INSERT_QUERY, new Object[]{cliente.getIdCliente(), cliente.getNombre(), cliente.getApellidoPaterno(), cliente.getApellidoMaterno(), cliente.getDireccion(), cliente.getPoblacion(), cliente.getTelefono(), cliente.getEmail(), cliente.getCodigoPostal(), cliente.getIntereses()});			
	}

	@Override
	public int eliminarCliente(JB_Cliente cliente) {
		return jdbcTemplate.update(DELETE_QUERY, new Object []{cliente.getIdCliente()});		
	}

	@Override
	public List<JB_Cliente> consultarCliente(JB_Cliente cliente) {
		List<JB_Cliente> lCliente = jdbcTemplate.query(SELECT_QUERY, new Object []{cliente.getIdCliente()}, new ClienteRowMapper());
		return lCliente;
	}

	@Override
	public int actualizarCliente(JB_Cliente cliente) {
		return jdbcTemplate.update(UPDATE_QUERY, new Object[]{cliente.getIdCliente(), cliente.getNombre(), cliente.getApellidoPaterno(), cliente.getApellidoMaterno(), cliente.getDireccion(), cliente.getPoblacion(), cliente.getTelefono(), cliente.getEmail(), cliente.getCodigoPostal(), cliente.getIntereses()});		
	}

}
