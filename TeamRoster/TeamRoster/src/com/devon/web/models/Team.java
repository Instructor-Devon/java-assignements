package com.devon.web.models;

import java.util.ArrayList;

public class Team {
	private String name;
	private ArrayList<Player> players;
	
	public Team(String name) {
		this.name = name;
		this.players = new ArrayList<Player>();
	}
	public void addPlayer(Player p) {
		this.players.add(p);
	}
	public void removePlayer(Player p) {
		this.players.remove(p);
	}
	public ArrayList<Player> getPlayers() {
		return players;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
