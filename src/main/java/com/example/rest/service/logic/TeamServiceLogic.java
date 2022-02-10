package com.example.rest.service.logic;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.rest.entity.Team;
import com.example.rest.store.TeamStore;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TeamServiceLogic implements com.example.rest.service.TeamService {

	private final TeamStore teamStore;
	
	@Override
	public String register(Team newTeam) {
		return this.teamStore.create(newTeam);
	}

	@Override
	public void modify(Team newTeam) {
		this.teamStore.update(newTeam);

	}

	@Override
	public void remove(String teamId) {
		this.teamStore.delete(teamId);

	}

	@Override
	public Team find(String teamId) {
		return this.teamStore.retrieve(teamId);
	}

	@Override
	public List<Team> findAll() {
		return this.teamStore.retrieveAll();
	}

}