package com.harsrav.spring;

public class Employe {
	
	private int age;
	private Computer com;
	
	
	public Employe() {
		System.out.println("Alien object created");
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("Age assigned");
		this.age = age;
	}
	
	
	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

	public void code() {
		System.out.println("Compiling started");
		com.compiled();
	}
	
	

}
