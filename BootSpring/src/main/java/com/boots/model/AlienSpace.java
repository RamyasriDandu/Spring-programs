package com.boots.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class AlienSpace {
	@Id
	private int aid;
	private String aname;
	
	
	public AlienSpace() {
		System.out.println("Inside default constructor");
	}
	public AlienSpace(int aid, String aname) {
		super();
		this.aid = aid;
		this.aname = aname;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "AlienSpace [aid=" + aid + ", aname=" + aname + "]";
	}
	
	

}
