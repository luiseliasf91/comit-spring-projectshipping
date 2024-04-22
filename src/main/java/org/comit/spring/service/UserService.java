package org.comit.spring.service;

import java.util.List;

import org.comit.spring.bean.Order;
import org.comit.spring.bean.Product;
import org.comit.spring.bean.User;
import org.comit.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
		
		@Autowired
		UserDao userDao;
		
		public List <User> listUser(){
		
			List <User> users = this.userDao.listUsers();
			
			return users;
	}

		public List <Order> listOrder(){
			
			List <Order> orders = this.userDao.listOrders();
			
			return orders;
	}
		
		public List <Product> listProduct(){
			
			List <Product> products = this.userDao.listproducts();
			
			return products;
	}
		
		public void createUser(User user) {
			
			this.validateUser(user);
			this.userDao.createUser(user);
		}
		
		public User findUser(User user){
			
			return this.userDao.findUser(user);
		}
		
		private void validateUser(User user) {
			
			if (user.getFirstName().isEmpty()||
				user.getLastName().isEmpty() ||
				user.getUserName().isEmpty()) {
				
				throw new RuntimeException("Invalid user Data: " + user);
			}
		}
		
		public void createProduct(Product product) {
			
			this.validateProduct(product);
			this.userDao.createProduct(product);
		}
		
		public Product findProduct(Product product){
			
			return this.userDao.findProduct(product);
		}
		
		private void validateProduct(Product product) {
			
			if (product.getSku().isEmpty()||
				product.getProductName().isEmpty() ||
				product.getDescription().isEmpty()) {
				
				throw new RuntimeException("Invalid user Data: " + product);
			}
		}
		
}
