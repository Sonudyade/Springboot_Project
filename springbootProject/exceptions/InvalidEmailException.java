package com.qac.springbootProject.exceptions;

public class InvalidEmailException extends RuntimeException{
	
	public InvalidEmailException() {
		super("Invalid email id");
	}

}
