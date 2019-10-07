package com.bridgelabz.servlet.model;

public class User {
	
	private String firstName;
	private String lastLast;
	private String password;
	private String email;
	private String contact;
	private String userName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastLast() {
		return lastLast;
	}
	public void setLastLast(String lastLast) {
		this.lastLast = lastLast;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastLast=" + lastLast + ", email=" + email
				+ ", contact=" + contact + ", userName=" + userName + "]";
	}
	
	
	

}
