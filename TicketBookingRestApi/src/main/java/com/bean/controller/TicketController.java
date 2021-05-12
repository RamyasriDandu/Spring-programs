package com.bean.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.model.TicketModel;
import com.bean.service.TicketService;

@RestController
@RequestMapping("//api/tickets")
public class TicketController {
	@Autowired
	private TicketService service;
	//getting all tickets
	@GetMapping("/get all tickets")
	public Iterable <TicketModel>getAllTickets() {
		return service.getAllTickets();
		
	
	}
	//creating ticketmodel
	@PostMapping("/create")
	public TicketModel createTicket(@RequestBody TicketModel ticket) {
		return service.createTicket(ticket);
		
	}
	
	//Get a ticket
	@GetMapping("/ticket/{ticketId}")
	public Optional <TicketModel>getTicket(@PathVariable("ticketId") Integer ticketId) {
		return service.getTicket(ticketId);
		
	}
	//Delete a ticket
	@DeleteMapping("/ticket/{ticketId}") 
	public void deleteTicket(@PathVariable("ticketId") Integer ticketId)
	{
		service.deleteTicket(ticketId);
		
	}
	
	//update ticket
	
	@PutMapping("/ticket/{ticketId}/{newEmail}")
	public TicketModel updateTicket(
			@PathVariable("ticketId") Integer ticketId,@PathVariable("new Email") String newEmail) {
		
				return service.updateTicket(ticketId, newEmail);
		
		
	}
	

}
