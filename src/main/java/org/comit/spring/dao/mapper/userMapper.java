package org.comit.spring.dao.mapper;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.comit.spring.bean.Admin;
import org.comit.spring.bean.User;
import org.springframework.jdbc.core.RowMapper;

public class userMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {

		User user = new User();
		
		user.setIdUser(rs.getInt("ID_USER"));
		user.setUserName(rs.getString("USERNAME"));
		user.setFirstName(rs.getString("FIRST_NAME"));
		user.setLastName(rs.getString("LAST_NAME"));
		user.setEmail(rs.getString("EMAIL"));
		user.setPassword(rs.getString("PASSWORD"));
		user.setBirthday(rs.getDate("BIRTHDAY_DATE"));
		user.setPhoneNumber(rs.getNString("PHONE_NUMBER"));
		//user.setIdAdmin(rs.getInt("ID_ADMIN"));
		
		Admin admin = new Admin();
		
		if (this.hasColumn(rs, "ID_ADMIN")) {
		
		admin.setIdAdmin(rs.getInt("ID_ADMIN"));
		admin.setNameAdmin(rs.getString("NAME_ADMIN"));
		admin.setDescripcionAdmin(rs.getString("DESCRIP_ADMIN"));
		admin.setStatusAdmin(rs.getString("STATUS_ADMIN"));
		
		}
		
		user.setAdmin(admin);
		
		return user;
	}
	
	private boolean hasColumn(ResultSet rs, String columnName) throws SQLException {
		
		ResultSetMetaData rsmd = rs.getMetaData();
		
		int columns = rsmd.getColumnCount();
		
		for (int i = 1; i <= columns; ++i) {
			if (columnName.equals(rsmd.getColumnName(i))) {
				return true;
			}
		}
		
		return false;
	}

}
