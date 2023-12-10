package com.bookstore.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.bookstore.jbeans.JB_Venta;
import org.springframework.jdbc.core.RowMapper;

public class VentaRowMapper implements RowMapper<JB_Venta> {

	@Override
	public JB_Venta mapRow(ResultSet rs, int f) throws SQLException {
		JB_Venta vBean = new JB_Venta(rs.getInt("idVenta"), rs.getString("isbn"), rs.getInt("idCliente"), rs.getInt("cantidad"), rs.getString("observaciones"));
		return vBean;
	}

}
