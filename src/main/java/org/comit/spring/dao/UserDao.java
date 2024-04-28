package org.comit.spring.dao;

import java.util.List;

import org.comit.spring.bean.Order;
import org.comit.spring.bean.Product;
import org.comit.spring.bean.User;
import org.comit.spring.dao.mapper.orderMapper;
import org.comit.spring.dao.mapper.productMapper;
import org.comit.spring.dao.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<User> listUsers() {

		String sql = "SELECT * FROM user U LEFT JOIN admin UR ON U.ID_ADMIN = UR.ID_ADMIN";

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

	public void createUser(User user) {

		String sqlu = "INSERT INTO user (USERNAME, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD, BIRTHDAY_DATE, PHONE_NUMBER)"
				+ "VALUES(?,?,?,?,?,?,?)";

		this.jdbcTemplate.update(sqlu, user.getUserName(), user.getFirstName(), user.getLastName(), user.getEmail(),
				user.getPassword(), user.getBirthday(), user.getPhoneNumber());

	}

	public User findUser(User user) {

		String sql = "SELECT * FROM user WHERE ID_USER != ? AND UPPER(USERNAME) = UPPER(?)";

		return DataAccessUtils
				.singleResult(this.jdbcTemplate.query(sql, new userMapper(), user.getIdUser(), user.getUserName()));

	}
	
	public User findUser(String username) {

		String sql = "SELECT * FROM user WHERE UPPER(USERNAME) = UPPER(?)";

		return DataAccessUtils
				.singleResult(this.jdbcTemplate.query(sql, new userMapper(), username));

	}

	public void createProduct(Product product) {

		String sqlu = "INSERT INTO product (SKU, PRODUCT_NAME, DESCRIPTION, STATUS_PRODUCT, PRODUCT_IMAGE, STOCK_QUANTITY, PRODUCT_PRICE)"
				+ "VALUES(?,?,?,?,?,?,?)";

		this.jdbcTemplate.update(sqlu, product.getSku(), product.getProductName(), product.getDescription(), product.getStatusProduct(), product.getProductImage(), product.getStockQuantity(), product.getProductPrice() );

	}
	
	public Product findProduct(Product product) {

		String sql = "SELECT * FROM product WHERE ID_PRODUCT != ? AND UPPER(SKU) = UPPER(?)";

		return DataAccessUtils
				.singleResult(this.jdbcTemplate.query(sql, new productMapper(), product.getIdProduct(), product.getSku()));

	}


}
