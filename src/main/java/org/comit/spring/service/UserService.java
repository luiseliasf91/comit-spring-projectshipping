package org.comit.spring.service;

import java.util.List;

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

}