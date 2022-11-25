package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.PersonRepo;
import com.example.demo.model.Person;

@Controller
public class PersonController {
	
	@Autowired
	PersonRepo repo;
	
	@RequestMapping("/")
	public String name()
	{
		System.out.println("come home");
		return "WelcomePage.jsp";
	}
	
	@RequestMapping("/addPerson")
	public String addPerson(Person person)
	{
		System.out.println("inside Person add");
		repo.save(person);
		return "WelcomePage.jsp";
		
		
	}

}


