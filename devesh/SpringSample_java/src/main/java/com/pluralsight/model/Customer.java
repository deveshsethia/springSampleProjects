package com.pluralsight.model;

public class Customer {
	
	public Customer(String firstname ,String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	String firstname;
	String lastname;
}
