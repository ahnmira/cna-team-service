package com.example.rest.store.logic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.rest.entity.Team;
import com.example.rest.store.TeamStore;

@Repository
public class TeamStoreLogic implements TeamStore {

	private Map<String, Team> teamMap;
	
	public TeamStoreLogic() {
		this.teamMap = new HashMap<>();
	}
	@Override
	public String create(Team newTeam) {
		this.teamMap.put(newTeam.getTeamId(), newTeam);
		return newTeam.getTeamId();
	}

	@Override
	public void update(Team newTeam) {
		this.teamMap.put(newTeam.getTeamId(), newTeam);
	}

	@Override
	public void delete(String teamId) {
		this.teamMap.remove(teamId);

	}

	@Override
	public Team retrieve(String teamId) {
		return this.teamMap.get(teamId);
	}

	@Override
	public List<Team> retrieveAll() {
		return this.teamMap.values().stream().collect(Collectors.toList());
	}

}
