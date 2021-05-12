package com.poc.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poc.student.model.Student;
import com.poc.student.service.ServiceStudent;

@RestController
@RequestMapping("/student")
public class ControllerStudent {
	@Autowired
	private ServiceStudent service;
	
	@PostMapping("/create")
	public Student create(Student student) {
		return service.create(student);
	}
	
	@GetMapping("/getAllStudents") 
	public Iterable<Student> getInfo() {
		return service.getAllStudents();
	}
	
//	@GetMapping("/getStudents")
//	public Iterable<Student> getStudent() {
//		return service.pagination();
//		
//	}
//	
	@GetMapping("/getPage")
	public Iterable<Student> pagiantionByNumber(@RequestParam("no") Integer number ) {
		return service.pagiantionByNumber(number);
	}
}
