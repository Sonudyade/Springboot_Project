package com.qac.springbootProject.entity;

import jakarta.persistence.Column;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


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
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddelName() {
		return middelName;
	}

	public void setMiddelName(String middelName) {
		this.middelName = middelName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMale() {
		return Male;
	}

	public void setMale(String male) {
		Male = male;
	}

	public String getFemale() {
		return Female;
	}

	public void setFemale(String female) {
		Female = female;
	}

	public String getOthers() {
		return Others;
	}

	public void setOthers(String others) {
		Others = others;
	}



	public int getoTP() {
		return oTP;
	}

	public void setoTP(int oTP) {
		this.oTP = oTP;
	}



	
	

	
	@Override
	public String toString() {
		return "SpringMvcRegistrationDetails [id=" + id + ", firstName=" + firstName + ", middelName=" + middelName
				+ ", lastName=" + lastName + ", email=" + email + ", password=" + password + ", number=" + number
				+ ", address=" + address + ", age=" + age + ", Male=" + Male + ", Female=" + Female + ", Others="
				+ Others + "]";
	}

}
