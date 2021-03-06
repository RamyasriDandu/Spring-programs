package com.boots.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.boots.dao.OrdersDao;
import com.boots.dao.ProductDao;
import com.boots.model.Orders;
import com.boots.model.Products;

@Service
public class ProductAndService {
	
	@Autowired
	private ProductDao productdao;
	
	@Autowired
	private OrdersDao orderdao;
	
	
	public Products createProduct(Products product) {
		return productdao.save(product);
	}
	
	public Orders createOrder(Orders order) {
		return orderdao.save(order);
		
	}
	
	public List<Products> getProducts() {
		return productdao.findAll();
		
	}
	
	public List<Orders> getOrders() {
		return orderdao.findAll();
		
	}
	
	public Optional<Products> getProductById(Integer ProductId) {
		return productdao.findById(ProductId);
		
	}
	
	public Optional<Orders> getOrderById(Integer orderId) {
		return orderdao.findById(orderId);
		
	}
	
	public int placeOrder(Integer productId, Integer quantity,Orders order) {
		int result = 1;
		Products product = productdao.findById(productId).orElse(new Products());
		if(order == null) {
			return result;
		}
		order.setQuantity(quantity);
		order.setProduct(product);
		orderdao.save(order);
		result = 0;
		return result;
		
	}
	public int modifyOrder(Integer orderId, Integer quantity) {
		int result = 1;
		Orders order = orderdao.findById(orderId).orElse(new Orders());
		if(order.getOrderId() == 0) {
		return result;
		}
		order.setQuantity(quantity);
		orderdao.save(order);
		result = 0;
		return result;
	
	}

}
