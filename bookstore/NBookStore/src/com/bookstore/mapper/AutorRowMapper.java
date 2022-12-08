package com.bookstore.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookstore.jbeans.JB_Autor;
import org.springframework.jdbc.core.RowMapper;

public class AutorRowMapper implements RowMapper<JB_Autor> {

	@Override
	public JB_Autor mapRow(ResultSet rs, int f) throws SQLException {
		JB_Autor aBean = new JB_Autor(rs.getInt("idAutor") , rs.getString("isbn") , rs.getString("nombre") , rs.getString("apellidoPaterno") , rs.getString("apellidoMaterno"));
		return aBean;
	}

}
