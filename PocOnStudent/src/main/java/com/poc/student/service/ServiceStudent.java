package com.poc.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.poc.student.dao.DaoStudent;
import com.poc.student.model.Student;

@Service
public class ServiceStudent {
	@Autowired
	private DaoStudent stud;

	public Student create(Student student) {
		return stud.save(student);
	}
	
	public Iterable<Student> getAllStudents(){
		return stud.findAll();
	}
	
	
	
	public Iterable<Student> pagiantionByNumber(Integer number){
		return stud.findAll(PageRequest.of(number, 3));
	
	}

}
