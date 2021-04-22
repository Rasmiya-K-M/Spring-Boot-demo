package com.ust.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/demo")
public class StudentController {
	@GetMapping("/home")
	public String getHomePage()
	{
	return "welcome to home page";
	}
	@GetMapping("/admin")
	public String getAdminPage()
	{
	return "welcome to admin page";
	}
	@GetMapping("/student")
	public String getUserPage()
	{
	return "welcome to student page";
	}
}
