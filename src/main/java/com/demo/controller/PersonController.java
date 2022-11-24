package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PersonController {
	
	@RequestMapping("home")
	public String name()
	{
		System.out.println("come home");
		return "WelcomePage.jsp";
	}

}


