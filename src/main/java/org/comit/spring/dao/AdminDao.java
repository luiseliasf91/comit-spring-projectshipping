package org.comit.spring.dao;

import java.util.List;

import org.comit.spring.bean.Admin;
import org.comit.spring.dao.mapper.adminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Admin> listAdmin() {

		String sql = "SELECT * FROM admin";

		return this.jdbcTemplate.query(sql, new adminMapper());

	}

}
