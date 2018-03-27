package com.kruders.action;

import org.apache.struts.validator.ValidatorForm;

public class LoginForm extends ValidatorForm{

	private String userName;
	private String password;
	private String guestEmail;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	

	public String getGuestEmail() {
		return guestEmail;
	}

	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}

	@Override
	public String toString() {
		return "LoginForm [userName=" + userName + ", password=" + password + "]";
	}
}
