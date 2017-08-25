package com.rockers.api.service.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rockers.api.dao.UserDao;
import com.rockers.api.model.User;
import com.rockers.api.repository.IUserRepository;

@RestController
@RequestMapping(value="/user")
public class UserController {

	
	@Autowired
	IUserRepository userRepository;
	
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Long> saveUser(@RequestBody User user){
		
	userRepository.save(user);
		return new ResponseEntity<Long>(user.getId().longValue(), HttpStatus.OK);
	}

	@RequestMapping(method=RequestMethod.PUT, value = "/update")
	public ResponseEntity<String> updateUser(@RequestBody User user) {
		userRepository.saveAndFlush(user);
		return new ResponseEntity<String>(user.getLogin(), HttpStatus.OK);	
	}
	
	@RequestMapping(method=RequestMethod.GET, value = "/show")
	public ResponseEntity<List<User>> showUser(){
		List<User> users = new ArrayList<User>();
		users = userRepository.findAll();
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/delete/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable ("id") Long id) {
		userRepository.delete(id);
		return new ResponseEntity<String>("Usuario deletado com sucesso", HttpStatus.OK);
	}
}
