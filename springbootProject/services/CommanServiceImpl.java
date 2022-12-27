package com.qac.springbootProject.services;
import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Service;

import com.qac.springbootProject.dao.DetailsDAO;
import com.qac.springbootProject.dto.Details;
import com.qac.springbootProject.dto.LoginDTO;
import com.qac.springbootProject.entity.SpringMvcRegistrationDetails;
import com.qac.springbootProject.exceptions.InvalidEmailException;
import com.qac.springbootProject.exceptions.InvalidPasswordException;
import com.qac.springbootProject.repo.MyRepository;




@Service
public class CommanServiceImpl implements CommanService{
	
	@Autowired
	private DetailsDAO dao;
	
	@Autowired
	private MyRepository repository;
	public String validateAndSave(Details details) {
		
		if(details.getEmail() != null && !details.getEmail().isEmpty()) {
			if(details.getPassword() !=null && !details.getPassword().isEmpty()) {
				if(details.getCnfPassword() !=null && !details.getCnfPassword().isEmpty()
						&& details.getCnfPassword().equals(details.getPassword())) {
					
					SpringMvcRegistrationDetails regDetails = new SpringMvcRegistrationDetails();
					regDetails.setPassword(details.getPassword());
					regDetails.setEmail(details.getEmail());
					regDetails.setNumber(details.getNumber());
					
					repository.save(regDetails);
					return "Data saved";
					
					
				}else {
					throw new InvalidPasswordException("Invalid cnfPassword");
				}		
				}else {
					throw new InvalidPasswordException("Invalid Password");
				}	
			   }else {
				throw new InvalidEmailException();
			}
	    
	}
	public String validateAndLogin(LoginDTO dto) {
		if(dto.getEmail() != null && !dto.getEmail().isEmpty()) {
			if(dto.getPassword() !=null && !dto.getPassword().isEmpty()) {
				SpringMvcRegistrationDetails registrationDetails =dao.getByEmail(dto.getEmail());
				
				if(dto.getEmail().equals(registrationDetails.getEmail())
						&& dto.getPassword().equals(registrationDetails.getPassword())) {
					return  dto.getEmail();
					
				}else {
					return "Invalid email and password";
				}
				
				
			}else {
				return "Invalid Password";
			}
			
		}else {
			return "Invalid email id";
		}
	    
	}
	public SpringMvcRegistrationDetails getMyProfile(String email) {
		SpringMvcRegistrationDetails registrationDetails  = null;
		if(email != null && !email.isEmpty()) {
		 registrationDetails =dao.getByEmail(email);
		
		
	}
		return registrationDetails;
	
	}
}
	


