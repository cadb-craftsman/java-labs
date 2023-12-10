package com.bookstore.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookstore.jbeans.JB_Almacen;
import org.springframework.jdbc.core.RowMapper;

public class AlmacenRowMapper implements RowMapper<JB_Almacen> {

	@Override
	public JB_Almacen mapRow(ResultSet rs, int f) throws SQLException {
		JB_Almacen aBean = new JB_Almacen(rs.getInt("idAlmacen"), rs.getString("isbn") , rs.getInt("cantidad"), rs.getDouble("precio"), rs.getString("observaciones"));
		return aBean;
	}

}
