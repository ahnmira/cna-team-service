package com.example.rest.entity;

import java.util.UUID;

import com.google.gson.Gson;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Team {
	private String teamId;
	private String teamName;
	
	public Team() {
		this.teamId=UUID.randomUUID().toString();
	}
	
	public Team(String teamName) {
		this();
		this.teamName = teamName;
	}
	
	public static Team sample() {
		return new Team("Tiger");
	}
	public static void main(String[] args) {
		Team team = new Team();
		System.out.println(new Gson().toJson(team));
	}
}