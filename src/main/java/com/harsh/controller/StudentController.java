package com.harsh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harsh.resources.Student;
import com.harsh.service.StudentService;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
	private StudentService studetService;
	@Autowired
	public StudentController(StudentService studetS) {
		super();
		this.studetService = studetS;
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAll(){
		List<Student> l = studetService.getAll();
		return new ResponseEntity<>(l,HttpStatus.OK);
	}
}
