package com.beans.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("myHome")
	public ModelAndView myHome() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("wish", "welcome");
		mv.setViewName("myhome");
		return mv;
		
	}
}
