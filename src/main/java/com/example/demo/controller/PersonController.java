package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/byname")
	@ResponseBody
	public List<Person> findbyname(@RequestParam String name)
	{
		return repo.findbyname(name);
		
		
		
	}
	
	
	@RequestMapping("/bypnamesorted")
	@ResponseBody
	public List<Person> findbypnamesorted(@RequestParam String pname)
	{

		return repo.findbypnamesorted(pname);
				
		
		
		
	}
	
	@RequestMapping("/bypname")
	@ResponseBody
	public List<Person> findbypname(@RequestParam String pname)
	{
		return repo.findbypname(pname);
		
		
		
	}
	@RequestMapping("/allPerson")
	@ResponseBody
	public List<Person> allPerson()
	{
		
		return repo.findAll();
		
	}
	
	@RequestMapping("/allPerson/{id}")
	@ResponseBody
	public Optional<Person> allPerson(@PathVariable("id") int id)
	{
		
		return repo.findById(id);
		
	}

}


