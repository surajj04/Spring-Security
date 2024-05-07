package org.secureapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/")
	public String homee() {
		return "index.jsp";
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login.jsp";
	}
	
	@RequestMapping("/logout-success")
	public String logoutPage() {
		return "logout.jsp";
	}
	
}
