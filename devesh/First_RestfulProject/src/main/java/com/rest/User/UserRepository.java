package com.rest.User;
import java.util.ArrayList;
import java.util.List;

import com.rest.model.*;
public class UserRepository {

	public UserRepository() {


	userList = new ArrayList<>(); 
    
	}

	private List<User> userList;
	
	public void addUser(String name) {
	User user= new User(name);
	userList.add(user);
	}
	public List<User> findAllUsers() {
		return userList;
	}
	public User findUser(String name) {
		for(int i=0;i<userList.size();i++) {
			if(userList.get(i).getUserName().equals(name)) {
				return userList.get(i);
			}
		}
		return null;
	}
	
}
