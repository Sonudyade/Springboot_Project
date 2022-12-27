package com.qac.springbootProject.dao;

import com.qac.springbootProject.entity.SpringMvcRegistrationDetails;

public interface DetailsDAO {
	
   public void save(SpringMvcRegistrationDetails details);
   
   
   public SpringMvcRegistrationDetails getByEmail(String email);

}
