package com.example.demo.model;

import lombok.Data;

@Data
public class Actor {

	private Integer actorId;
	private String actorName;
	private Integer actorage;
	private String actorStatus;

	public Actor(Integer actorId, String actorName, Integer actorage, String actorStatus) {
		super();
		this.actorId = actorId;
		this.actorName = actorName;
		this.actorage = actorage;
		this.actorStatus = actorStatus;
	}

	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

}
