package com.example.demo.entities;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginData {

	@NotBlank(message = "UserName can't be Null !!")
	@Size(min = 3,max = 12,message = "Usernamae must be between 2 to 12characters")
	private String userName;
	
	
	//@Pattern
	@Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"
, message = "Invalid Email")
	private String email;

	
	@AssertTrue
	private boolean agreed;
	
	public boolean isAgreed() {
		return agreed;
	}

	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}

	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
