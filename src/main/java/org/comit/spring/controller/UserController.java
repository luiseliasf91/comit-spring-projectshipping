package org.comit.spring.controller;

import java.util.List;

import org.comit.spring.bean.Order;
import org.comit.spring.bean.Product;
import org.comit.spring.bean.User;
import org.comit.spring.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
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
	
	@GetMapping("/orders")
	ModelAndView listOrders() {
		
		List<Order> orders =this.userService.listOrder();
		
		return new ModelAndView("orders","orders",orders);
	}
	
	@GetMapping("/products")
	ModelAndView listProducts() {
		
		List<Product> products =this.userService.listProduct();
		
		return new ModelAndView("products","products",products);
	}
	
	@GetMapping("/create")
	String showCreate(User user) {
		
		return "create";
	}
	
	@PostMapping("/create")
	String createUser(User user, BindingResult binding) {
		
		this.logger.debug("Creating User, {}", user.toString());
		
		this.validateUsername(user, binding);
		
		if (binding.hasErrors()) {
			return "create";
		}
		
		this.userService.createUser(user);
		
		return "redirect:/list";
	}
	
	private void validateUsername(User user, BindingResult binding) {
		
		
		if (this.userService.findUser(user) != null) {
			binding.addError(new FieldError("user","username",user.getUserName(), 
					 false, null, null, "* Username already taken."));
		}
		
	}
		
		@GetMapping("/createProduct")
		String showProduct(Product product) {
			
			return "createProduct";
		}
		
		@PostMapping("/createProduct")
		String createProduct(Product product, BindingResult binding) {
			
			this.logger.debug("Creating Product, {}", product.toString());
			
			this.validateProduct(product, binding);
			
			if (binding.hasErrors()) {
				return "createProduct";
			}
			
			this.userService.createProduct(product);
			
			return "redirect:/product";
		}
		
		private void validateProduct(Product product, BindingResult binding) {
			
			if (this.userService.findProduct(product) != null) {
				binding.addError(new FieldError("product","sku",product.getSku(), 
						 false, null, null, "* SKU already taken."));
			}

//		
//		if (Optional.ofNullable(this.userService.findUser(user)).isPresent()) {
//			binding.addError(new FieldError("user","username",user.getUserName(), 
//					false, null, null, "* Username already taken."));
//		}
	
}
}
