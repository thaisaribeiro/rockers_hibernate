package com.rockers.api.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.rockers.api.model.Team;

@Component
public class TeamDao implements Crud<Team> {

	@Override
	public Team findOne(String id) {
		Team team = new Team();
		team.setName("Bruce");
		return team;
	}

	@Override
	public String save(Team t) {
		t.setName("Wayne");
		return t.getName();
	}

	@Override
	public List<Team> listAll() {
		List<Team> teamlist = new ArrayList<Team>();
		Team team = new Team();
		team.setName("Diana");
		teamlist.add(team);
		
		Team team2 = new Team();
		team2.setName("Ravena");
		teamlist.add(team2);
		
		return teamlist;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
