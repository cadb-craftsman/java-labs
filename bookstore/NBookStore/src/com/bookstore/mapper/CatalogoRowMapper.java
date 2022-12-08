package com.bookstore.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookstore.jbeans.JB_Catalogo;
import org.springframework.jdbc.core.RowMapper;

public class CatalogoRowMapper implements RowMapper<JB_Catalogo> {

	@Override
	public JB_Catalogo mapRow(ResultSet rs, int f) throws SQLException {
		JB_Catalogo cBean = new JB_Catalogo(rs.getInt("idCatalogo"), rs.getString("isbn"), rs.getString("categoria"), rs.getString("genero"));
		return cBean;
	}

}
