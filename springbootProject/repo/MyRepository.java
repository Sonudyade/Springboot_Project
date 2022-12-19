package com.qac.springbootProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qac.springbootProject.entity.SpringMvcRegistrationDetails;

 
public interface MyRepository extends JpaRepository<SpringMvcRegistrationDetails, Integer>{
	
	SpringMvcRegistrationDetails getByEmail(String emailid);

}
