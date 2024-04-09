package org.comit.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class _01_Controller {
	
	@GetMapping("/template")
	String Welcome() {
		System.out.println("Welcome");
		
		return "welcome";
}
}
