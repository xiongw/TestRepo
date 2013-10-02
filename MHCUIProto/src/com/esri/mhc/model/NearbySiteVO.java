package com.esri.mhc.model;

public class NearbySiteVO {

	private String name;
	private String mile;
	private String challenge;
	
	public NearbySiteVO(String name, String mile, String challenge){
		this.name=name;
		this.mile=mile;
		this.challenge=challenge;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMile() {
		return mile;
	}

	public void setMile(String mile) {
		this.mile = mile;
	}

	public String getChallenge() {
		return challenge;
	}

	public void setChallenge(String challenge) {
		this.challenge = challenge;
	}
	
}
