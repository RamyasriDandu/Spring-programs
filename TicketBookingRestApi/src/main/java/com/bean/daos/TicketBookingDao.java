package com.bean.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.model.TicketModel;



@Repository
public interface TicketBookingDao extends JpaRepository<TicketModel, Integer>{

}
