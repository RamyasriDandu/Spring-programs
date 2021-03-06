package com.boots.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boots.model.Message;
import com.boots.model.Orders;
import com.boots.model.Products;
import com.boots.service.ProductAndService;

@RestController
@RequestMapping("/rest")
public class ProductAndOrderController {
	
	@Autowired
	ProductAndService service;
	
	@PostMapping("/product/create")
	public Products createProduct(@RequestBody Products product) {
		return service.createProduct(product);
	}
	
	@GetMapping("/product/list") 
	public List<Products> getProducts() {
		return service.getProducts();
	}
	
	@PostMapping("/order/create") 
	public Orders createOrder(@RequestBody Orders order) {
		return service.createOrder(order);
	
	}
	
	@GetMapping("/order/list") 
	public List<Orders> getOrders() {
		return service.getOrders();
		
	}
	
	@GetMapping("/product/get")
	public Optional<Products> getProductById(@RequestParam("id") Integer id) {
		return service.getProductById(id);
	}
	
	@GetMapping("/order/get")
	public Optional<Orders> getOrderById(@RequestParam("id") Integer id) {
		return service.getOrderById(id);
	}
	@GetMapping("/order/place")
	public Message placeOrder(@RequestParam("product_id") Integer Id,@RequestParam("quantity") Integer quantity) {
		Message msg = getMessage();
		try {
		Orders order = new Orders();
		int code = service.placeOrder(Id, quantity, order);
		if(code == 0) {
			msg.setCode(0);
			msg.setMessage("Order placed successfully");
		}
		else {
			msg.setCode(1);
			msg.setMessage("Invalid Order");
		}
		return msg;
	}
		catch(Exception e) {
			return msg;
		}
	}
	
	@GetMapping("order/modify")
	public Message modifyOrder(Integer orderId, Integer quantity) {
		Message msg = getMessage();
		try {
			int code = service.modifyOrder(orderId, quantity);
			if(code == 0) {
				msg.setCode(0);
				msg.setMessage("Order placed successfully");
			}
			else {
				msg.setCode(1);
				msg.setMessage("Invalid Order");
			}
		return msg;
		}catch(Exception e) {
			return msg;
		}
		
	}
	
	

	public static  Message getMessage() {
		// TODO Auto-generated method stub
		return new Message();
	}


}
