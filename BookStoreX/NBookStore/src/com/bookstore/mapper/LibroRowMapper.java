package com.bookstore.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookstore.jbeans.JB_Libro;
import org.springframework.jdbc.core.RowMapper;

public class LibroRowMapper implements RowMapper<JB_Libro> {

	@Override
	public JB_Libro mapRow(ResultSet rs, int f) throws SQLException {
		JB_Libro lBean = new JB_Libro(rs.getString("isbn"),
				rs.getString("titulo"), rs.getString("edicion"),
				rs.getDate("añoEdicion"), rs.getString("editorial"),
				rs.getString("idioma"), rs.getString("descripcion"),
				rs.getString("categoria"), rs.getString("genero"),
				rs.getDouble("precio"));
		return lBean;
	}

}
