package com.qac.springbootProject.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qac.springbootProject.entity.SpringMvcRegistrationDetails;
import com.qac.springbootProject.repo.MyRepository;

@RestController
public class AppController {
	
	@Autowired
	private MyRepository repository;
	
	@GetMapping(value = "/hello")
	public String hello() {
		SpringMvcRegistrationDetails details = repository.getByEmail("Sony123@gmail.com");
		System.out.println(details);
		return "Hello,Software Developer";
	}
	

}
