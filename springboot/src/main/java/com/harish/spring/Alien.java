package com.harish.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	@Autowired
	Laptop ltop; //we are not creating the object here we didnt insta
	public void code() {
		ltop.complie();
	}

}
