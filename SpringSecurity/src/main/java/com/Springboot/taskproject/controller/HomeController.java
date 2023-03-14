package com.Springboot.taskproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/home")
public String homepage() {
		return "Home";
	}
	@GetMapping("/common")
public String common() {
		return "Common";
	}
	@GetMapping("/admin")
public String admin() {
		return "Admin";
	}
	@GetMapping("/denied")
public String denied() {
		return "Denied";
	}
	
}
