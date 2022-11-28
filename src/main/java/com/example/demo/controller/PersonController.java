package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.PersonRepo;
import com.example.demo.model.Person;

@RestController
public class PersonController {
	
	@Autowired
	PersonRepo repo;
	
	@RequestMapping("/")
	public String name()
	{
		System.out.println("come home");
		return "WelcomePage.jsp";
	}
	
	@PostMapping(path="/addPerson" , produces ={MediaType.APPLICATION_JSON_VALUE})
	public Person addPerson(Person person )
	{
		
		repo.save(person);
		return person;
		
		
	}
	@PutMapping(path="/updatePerson/{id}" , produces ={MediaType.APPLICATION_JSON_VALUE})
	public Person updatePerson(Person person )
	{

		repo.save(person);
		return person;
		
		
	}
	
	@DeleteMapping(path="/deletePerson/{id}" )
	public void deletePerson(@RequestParam int id )
	{
		
		repo.deleteById(id);
		
	
		
		
	}
	@GetMapping("/byname")
	
	public List<Person> findbyname(@RequestParam String name)
	{
		return repo.findbyname(name);
		
		
		
	}
	
	
	@RequestMapping("/bypnamesorted")
	
	public List<Person> findbypnamesorted(@RequestParam String pname)
	{

		return repo.findbypnamesorted(pname);
				
		
		
		
	}
	
	@RequestMapping("/bypname")

	public List<Person> findbypname(@RequestParam String pname)
	{
		return repo.findbypname(pname);
		
		
		
	}
	//modified method to support only xml format
	//@RequestMapping(path="/allPerson" , produces= {"application/xml"})
	@RequestMapping(path="/allPerson" )
	
	public List<Person> allPerson()
	{
		
		return repo.findAll();
		
	}
	
	
	
	
	@RequestMapping("/allPerson/{id}")
	
	public Optional<Person> allPerson(@PathVariable("id") int id)
	{
		
		return repo.findById(id);
		
	}

}


