package com.rockers.api.service.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {

	@RequestMapping(method = RequestMethod.GET, value ="/{name}")
	public ResponseEntity<String> getStatus(@PathVariable String name){
		String msg = "Hi " + name + " our service is UP and Running!!!";
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
}
