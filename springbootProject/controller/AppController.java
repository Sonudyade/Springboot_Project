package com.qac.springbootProject.controller;

import org.slf4j.Logger;




import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.qac.springbootProject.dto.Details;
import com.qac.springbootProject.dto.LoginDTO;
import com.qac.springbootProject.entity.SpringMvcRegistrationDetails;
import com.qac.springbootProject.repo.MyRepository;
import com.qac.springbootProject.services.CommanService;


@RestController
public class AppController<ForgetPassDTO> {
	
	Logger log = LoggerFactory.getLogger(AppController.class);
	
	@Autowired
	private CommanService service;
	
	@Autowired
	private MyRepository myRepository;
		
	@GetMapping(value = "/hello")
	public String hello() {
		SpringMvcRegistrationDetails details = myRepository.getByEmail("Sony123@gmail.com");
		System.out.println(details);
		SpringMvcRegistrationDetails details1 = myRepository.getByNumber("6685463322");
		log.info(""+details1);
		return "Hello,Software Developer";
	}
	@PostMapping(value ="/save")
	public String save(String name ,String pass) {
		log.info(name +"\t"+pass);
		return "data saved";
	}
	@PostMapping(value ="/details")
	public Details details(@RequestBody Details  details) {
		log.info("" +details);
		return details;
		
	}
	@PostMapping(value = "/register" )
	public String  register(@RequestBody Details details) {	
	String msg = null;
	try {
		 msg = service.validateAndSave(details);
		log.info(msg);
	}
	catch(Exception e) {
		log.error(e.getMessage());
		msg = e.getMessage();
	}
    return msg;
	}
	@PostMapping(value ="/login")
	public String login(@RequestBody LoginDTO dto) {
       
        System.out.println(dto);
        String response = service.validateAndLogin(dto);
        System.out.println(response);
    	
        return response;
	}
	@PostMapping(value = "/getMyProfile/{id}")
	public SpringMvcRegistrationDetails getMyProfile(@PathVariable("id") String id) {

		  System.out.println(id);
		  SpringMvcRegistrationDetails response = service.getMyProfile(id);
		  System.out.println(response);
		  
		  return response;
		
	
	}
}
