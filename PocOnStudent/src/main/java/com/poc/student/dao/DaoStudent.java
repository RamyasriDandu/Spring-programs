package com.poc.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.student.model.Student;

@Repository
public interface DaoStudent extends JpaRepository<Student, Integer> {
	

}
