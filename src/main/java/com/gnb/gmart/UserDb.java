package com.gnb.gmart;

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
}
