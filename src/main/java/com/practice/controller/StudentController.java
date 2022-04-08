package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.model.Student;
import com.practice.repository.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	StudentRepository stdRepository;
	
	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student std) {
		try {
			Student stdObj = stdRepository.save(std);
			return stdObj;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
