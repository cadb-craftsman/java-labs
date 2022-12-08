package com.bookstore.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookstore.jbeans.JB_Usuario;
import org.springframework.jdbc.core.RowMapper;

public class UsuarioRowMapper implements RowMapper<JB_Usuario> {

	@Override
	public JB_Usuario mapRow(ResultSet rs, int f) throws SQLException {
		JB_Usuario uBean = new JB_Usuario(rs.getInt("idUsuario"), rs.getString("usuario"), rs.getString("password"), rs.getString("email"), rs.getInt("idCliente"));
		return uBean;
	}

}
