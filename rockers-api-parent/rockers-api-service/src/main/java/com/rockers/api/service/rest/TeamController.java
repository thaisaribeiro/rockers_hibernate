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

import com.rockers.api.dao.TeamDao;
import com.rockers.api.model.Team;
import com.rockers.api.repository.ITeamRepository;

@RestController
@RequestMapping(value="/team")
public class TeamController {

	@Autowired
	ITeamRepository teamRepository;
	
	@RequestMapping(method=RequestMethod.POST, value ="/save")
	public ResponseEntity<Long> saveTeam(@RequestBody Team team){
		
	teamRepository.save(team);
		return new ResponseEntity<Long>(team.getId().longValue(), HttpStatus.OK);
	}

	@RequestMapping(method=RequestMethod.PUT, value = "/update")
	public ResponseEntity<String> updateTeam(@RequestBody Team team) {
		teamRepository.saveAndFlush(team);
		return new ResponseEntity<String>(team.getName(), HttpStatus.OK);	
	}
	
	@RequestMapping(method=RequestMethod.GET, value = "/show")
	public ResponseEntity<List<Team>> showTeam(){
		List<Team> team = new ArrayList<Team>();
		team = teamRepository.findAll();
		return new ResponseEntity<List<Team>>(team, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/delete/{id}")
	public ResponseEntity<String> deleteTeam(@PathVariable ("id") Long id) {
		teamRepository.delete(id);
		return new ResponseEntity<String>("Usuario deletado com sucesso", HttpStatus.OK);
	}
}
