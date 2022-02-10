package com.example.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.entity.Team;
import com.example.rest.service.TeamService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TeamController {
	private final TeamService teamService;

	@PostMapping("/teams")
	public String register(@RequestBody Team newTeam) {
		return teamService.register(newTeam);
	}
	
	@GetMapping("/teams/{teamId}")
	public Team find(@PathVariable String teamId) {
		return teamService.find(teamId);
	}

	@GetMapping("/teams")
	public List<Team> findAll() {
		return teamService.findAll();
	}	

	@PutMapping("/teams")
	public void modify(@RequestBody Team newTeam) {
		teamService.modify(newTeam);
	}	
	
	@DeleteMapping("/teams/{teamId}")
	public void delete(@PathVariable String teamId) {
		teamService.remove(teamId);
	}		
}