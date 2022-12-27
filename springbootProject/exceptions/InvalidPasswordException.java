package com.qac.springbootProject.exceptions;

public class InvalidPasswordException extends RuntimeException{
	
	public InvalidPasswordException(String msg) {
		super(msg);
		
	}


}
