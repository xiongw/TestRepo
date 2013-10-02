package com.esri.mhc.model;

public class ExpeditionVO {
	
	private String name;
	private String site;
	
	public ExpeditionVO(String name, String site){
		this.name=name;
		this.site=site;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//this.name = name;
		this.name = name;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
		//this.site = site;		
	}
}
