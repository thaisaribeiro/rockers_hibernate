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

import com.rockers.api.dao.ContractDao;
import com.rockers.api.model.Contract;
import com.rockers.api.repository.ContractRepository;

@RestController
@RequestMapping(value="/contract")
public class ContractController {

	@Autowired
	 ContractRepository contractRepository;
	
	@RequestMapping(method=RequestMethod.POST, value ="/save")
	public ResponseEntity<Long> saveContract(@RequestBody Contract cont){
		
    contractRepository.save(cont);
		return new ResponseEntity<Long>(cont.getId(), HttpStatus.OK);
	}

	@RequestMapping(method=RequestMethod.PUT, value = "/update")
	public ResponseEntity<Long> updateContract(@PathVariable ("id") Long id) {
		Contract cont = contractRepository.findOne(id);
		return new ResponseEntity<Long>(cont.getId(), HttpStatus.OK);	
	}
	
	@RequestMapping(method=RequestMethod.GET, value = "/show")
	public ResponseEntity<List<Contract>> showContract(){
		List<Contract> cont = new ArrayList<Contract>();
		cont = contractRepository.findAll();
		return new ResponseEntity<List<Contract>>(cont, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/delete/{id}")
	public ResponseEntity<String> deleteContract(@PathVariable ("id") Long id) {
		contractRepository.delete(id);
		return new ResponseEntity<String>("Usuario deletado com sucesso", HttpStatus.OK);
	}
}


