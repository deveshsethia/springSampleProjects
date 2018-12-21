package com.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public User(String userName) {


		this.userName = userName;
	}

	String userName;
	
}
