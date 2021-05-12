package com.ojas.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ojas.models.Product;
@Controller
public class ControllerConfigure {
	@RequestMapping(value = "/price", method = RequestMethod.GET)
	public String calculate(ModelMap model) {
		Product product = new Product();
		model.put("product", product);
		product.setPrice(15.00);
		return "price";
	}
	@RequestMapping(value = "/price", method = RequestMethod.POST)
	public String calculate(Product product, ModelMap model) {
		double netprice = product.getPrice() - (product.getPrice() * product.getDiscount()/100);
		product.setNetprice(netprice);
		return "price";
	
	}

}
