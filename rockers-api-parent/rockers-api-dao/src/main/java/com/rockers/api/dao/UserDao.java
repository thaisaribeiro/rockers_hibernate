package com.rockers.api.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rockers.api.model.User;

@Component
public class UserDao implements Crud<User> {
	
	@Override
	public User findOne(String id) {
		User user = new User();
		user.setLogin("123456");
		user.setPassword("456789");
		return user;
	}

	@Override
	public String save(User t) {
		return null;
	}
	
	@Override
	public List<User> listAll() {
		List<User> users = new ArrayList<User>();
		User user1 = new User();
		user1.setLogin("Batman");
		user1.setPassword("nananan");
		users.add(user1);
		
		User user2 = new User();
		user2.setLogin("Flash");
		user2.setPassword("147258");
		users.add(user2);
		
		return users;
	}

	@Override
	public void delete(String id) {
		
		
	}


}
