package com.qac.springbootProject.services;

import com.qac.springbootProject.dto.Details;

import com.qac.springbootProject.dto.LoginDTO;
import com.qac.springbootProject.entity.SpringMvcRegistrationDetails;

public interface CommanService {
	
	public String validateAndSave(Details details);

	public String validateAndLogin(LoginDTO dto);

	public SpringMvcRegistrationDetails getMyProfile(String email);


	
	
	

}
