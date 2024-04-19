package org.comit.spring.dao;

import java.util.List;

import org.comit.spring.bean.Order;
import org.comit.spring.bean.Product;
import org.comit.spring.bean.User;
import org.comit.spring.dao.mapper.orderMapper;
import org.comit.spring.dao.mapper.productMapper;
import org.comit.spring.dao.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<User> listUsers() {

		String sql = "SELECT * FROM user";

		return this.jdbcTemplate.query(sql, new userMapper());

	}

	public List<Order> listOrders() {

		String sqlo = "SELECT * FROM orders";

		return this.jdbcTemplate.query(sqlo, new orderMapper());
	}

	public List<Product> listproducts() {

		String sqlp = "SELECT * FROM product";

		return this.jdbcTemplate.query(sqlp, new productMapper());
	}
}
