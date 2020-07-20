package com.gnb.gmart;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDb {

	public User findUserById(Integer id) {
		User user = null;
		if(id == 1) {
			user = new User(1,"Banishree"); 
		}
		return user;
	}
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		users.add(new User(2, "Banishree"));
		users.add(new User(3, "Ami"));
		return users;
	}
}
