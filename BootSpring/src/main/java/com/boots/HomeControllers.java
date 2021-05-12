package com.boots;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.boots.model.AlienSpace;

@Controller
public class HomeControllers {
	@Autowired
	AlienSpaceRepo repo;
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name","Aliensspace");
	}
	
	@RequestMapping("/") 
	public String home() {
		return "index";
	}
	@GetMapping("/getAlien")
	public String getAlien(Model m) {
		
		m.addAttribute("result",repo.findAll());
		
		return "showAliens";
	}
	@GetMapping("/getAliensspace")
	public String getAliensspace(@RequestParam int aid, Model m) {
		
//	List<AlienSpace> aliens = Arrays.asList(new AlienSpace(101,"Harish"), new AlienSpace(102,"shravya"));
		
	m.addAttribute("result",repo.getOne(aid));
	//new AlienSpace(aid,"Harish")
	
//repo.getOne(aid)	
		return "showAliens";
	}
	
	@GetMapping("/getAliensspaceByName")
	public String getAliensspaceByName(@RequestParam String aname, Model m) {
		
	m.addAttribute("result",repo.findByAnameOrderByAidDesc(aname));
//OrderByAname
	
	
		return "showAliens";
	}
	@PostMapping(value="/addAlien") 
	public String addAlien(@ModelAttribute AlienSpace alienSpace) {
	repo.save(alienSpace);
		return "result";
	}
}
		
	
