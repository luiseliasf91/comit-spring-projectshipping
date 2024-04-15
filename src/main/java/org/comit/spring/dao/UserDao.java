package org.comit.spring.dao;

import java.util.List;

import org.comit.spring.bean.User;
import org.comit.spring.dao.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<User> listUsers(){
		
		String sql = "SELECT * FROM user";
				
		return this.jdbcTemplate.query(sql, new userMapper());
		
	}
}
