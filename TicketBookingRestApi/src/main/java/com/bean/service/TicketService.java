package com.bean.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.daos.TicketBookingDao;
import com.bean.model.TicketModel;

@Service
public class TicketService {
	@Autowired
	private TicketBookingDao ticketbookingdao;
	public TicketModel createTicket(TicketModel ticket) {
		return ticketbookingdao.save(ticket);
		
	}
	public Iterable<TicketModel> getAllTickets() {
		return ticketbookingdao.findAll();
		//select * from ticket;
	}
	public Optional<TicketModel> getTicket(Integer ticketId) {
		return ticketbookingdao.findById(ticketId);
		//select * from ticket where ticket_id = ticketid;
	}
	public void deleteTicket(Integer ticketId) {
		ticketbookingdao.deleteById(ticketId);
	}
	public TicketModel updateTicket(Integer ticketId,String newEmail) {
		TicketModel ticket = ticketbookingdao.findById(ticketId).orElse(new TicketModel());
		ticket.setEmail(newEmail);
		return ticketbookingdao.save(ticket);
		
	}
	}
	


