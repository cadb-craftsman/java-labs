package com.bookstore.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.bookstore.jbeans.JB_Oferta;

public class OfertaRowMapper implements RowMapper<JB_Oferta> {

	@Override
	public JB_Oferta mapRow(ResultSet rs, int f) throws SQLException {
		JB_Oferta oBean = new JB_Oferta(rs.getInt("idOferta"), rs.getString("marcaOferta"), rs.getString("isbn"),rs.getInt("idAlmacen"));
		return oBean;
	}

}
