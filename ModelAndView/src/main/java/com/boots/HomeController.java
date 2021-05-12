package com.boots;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller 
public class HomeController {
	
	@ModelAttribute
	public void ModelData(Model m) {
		m.addAttribute("name","Aliens");
	}
	@RequestMapping("/")
	public String home() {
		return "index";
	
	}
//	@RequestMapping("/add")
	
//	public String add(@RequestParam("num1")int i,@RequestParam("num2")int j,HttpSession session) {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		
//		int num3 = i + j;
//		
//		HttpSession  session = req.getSession();
//		session.setAttribute("num3",num3);
//		return "result.jsp";
		
	@RequestMapping("/add")
	public  String add(@RequestParam("num1")int i,@RequestParam("num2")int j,Model m) {
		
		int num3 = i + j;
		m.addAttribute("num3",num3);
		return "result";
	}
	
	@RequestMapping("/addSpace")
	public String addAlien(@ModelAttribute("a1") Space s) {
		return "result";
		
	}

}
