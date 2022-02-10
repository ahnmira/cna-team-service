package com.example.rest.store;

import java.util.List;

import com.example.rest.entity.Team;


public interface TeamStore {
	String create(Team newTeam);
	void update(Team newTeam);
	void delete(String teamid);
	
	Team retrieve(String teamid);
	List<Team> retrieveAll();
}
