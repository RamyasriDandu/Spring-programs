package com.boots.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boots.model.Orders;
@Repository
public interface OrdersDao extends JpaRepository<Orders, Integer>{

}
