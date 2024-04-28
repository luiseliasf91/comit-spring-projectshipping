package org.comit.spring.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.comit.spring.bean.Admin;
import org.springframework.jdbc.core.RowMapper;

public class adminMapper implements RowMapper<Admin> {

	@Override
	public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Admin admin = new Admin();
		
		admin.setIdAdmin(rs.getInt("ID_ADMIN"));
		admin.setNameAdmin(rs.getString("NAME_ADMIN"));
		admin.setDescripcionAdmin(rs.getString("DESCRIP_ADMIN"));
		admin.setStatusAdmin(rs.getString("STATUS_ADMIN"));
		
		return admin;
	}

}
