package com.bookstore.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookstore.jbeans.JB_Cliente;
import org.springframework.jdbc.core.RowMapper;

public class ClienteRowMapper implements RowMapper<JB_Cliente> {

	@Override
	public JB_Cliente mapRow(ResultSet rs, int f) throws SQLException {
		JB_Cliente cBean = new JB_Cliente(rs.getString("idCliente"), rs.getString("nombre"), rs.getString("apellidoPaterno"), rs.getString("apellidoMaterno"), rs.getString("direccion"), rs.getString("poblacion"), rs.getString("telefono"), rs.getString("email"), rs.getInt("codigoPostal"), rs.getString("intereses"));
		return cBean;
	}

}
