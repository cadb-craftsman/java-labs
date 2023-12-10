/* 
   
 */
package com.bookstore.persistencia;

import java.util.List;
import com.bookstore.jbeans.JB_Usuario;
import com.bookstore.mapper.UsuarioRowMapper;
import com.bookstore.crud.interfaz.ICRUDUsuario;

import org.springframework.jdbc.core.JdbcTemplate;

public class UsuarioDaoImpl implements ICRUDUsuario{

	private JdbcTemplate jdbcTemplate;
	
	private String INSERT_QUERY = "insert into usuario (idUsuario, usuario, password, email, idCliente) values(?, ?, ?, ?, ?)"; 
	private String SELECT_QUERY = "select idUsuario, usuario, password, email, idCliente from usuario where (idUsuario = ?)"; 
	private String DELETE_QUERY = "delete from usuario where (idUsuario = ?)";
	private String UPDATE_QUERY = "update usuario set (idUsuario = ?, usuario = ?, password = ?, email = ?, idCliente = ?) where( idUsuario = ?)";
	
	public UsuarioDaoImpl() {
		super();
	}

	public UsuarioDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertarUsuario(JB_Usuario usuario) {
		jdbcTemplate.update(INSERT_QUERY, new Object []{usuario.getIdUsuario(), usuario.getUsuario(), usuario.getPassword(), usuario.getEmail(), usuario.getIdCliente()});		
	}

	@Override
	public void eliminarUsuario(JB_Usuario usuario) {
		jdbcTemplate.update(DELETE_QUERY, new Object[]{usuario.getIdUsuario()});
	}

	@Override
	public List<JB_Usuario> consultarUsuario(JB_Usuario usuario) {
		List<JB_Usuario> lUsuario = jdbcTemplate.query(SELECT_QUERY, new Object []{usuario.getIdUsuario()}, new UsuarioRowMapper());
		return lUsuario;
	}

	@Override
	public void actualizarUsuario(JB_Usuario usuario) {
		jdbcTemplate.update(UPDATE_QUERY, new Object[]{usuario.getIdUsuario(), usuario.getUsuario(), usuario.getPassword(), usuario.getEmail(), usuario.getIdCliente()});
	}

}
