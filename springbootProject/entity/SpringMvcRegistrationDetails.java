package com.qac.springbootProject.entity;

import jakarta.persistence.Column;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "springmvc_reg_details")
public class SpringMvcRegistrationDetails {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="middelname")
	private String middelName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="number")
	
	private String number;
	
	@Column(name="address")
	private String address;
	
	@Column(name="age")
	private String age;
	
	@Column(name="Male")
	private String Male;
	
	@Column(name="Female")
	private String Female;
	
	@Column(name="Others")
	private String Others;
	
	@Column(name="otp")
	private int oTP;
	

}
