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
		
}
