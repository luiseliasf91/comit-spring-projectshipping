package org.comit.spring.controller;

import java.util.List;

import org.comit.spring.bean.User;
import org.comit.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	String index() {
		
		return "index";
	}
	
	@GetMapping("/list")
	ModelAndView listUsers() {
		
		List<User> users = this.userService.listUser();
		
		return new ModelAndView("list","users",users);
	}
}
