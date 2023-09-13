package com.smart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@RequestMapping("/home")
	public String AdminHome() {

		return "/Admin/admin_home";
	}

	@RequestMapping("/login")
	public String Adminlogin() {

		return "/Admin/admin_login";
	}
}
