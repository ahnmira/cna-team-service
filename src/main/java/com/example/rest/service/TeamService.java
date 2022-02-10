package com.example.rest.service;

import java.util.List;

import com.example.rest.entity.Team;

public interface TeamService {
	String register(Team newTeam);
	void modify(Team newTeam);
	void remove(String teamId);
	
	Team find(String teamId);
	List<Team> findAll();
}

