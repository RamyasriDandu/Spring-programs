package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bean.service.TicketService;

@SpringBootApplication
public class TicketBookingRestApiApplication {
	@Autowired
	private TicketService service;

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingRestApiApplication.class, args);
	}

}
