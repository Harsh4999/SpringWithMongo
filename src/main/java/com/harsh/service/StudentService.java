package com.harsh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harsh.repository.StudentRepository;
import com.harsh.resources.Student;

@Service
public class StudentService {
	private StudentRepository studentRepository;
	@Autowired
	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	public List<Student> getAll(){
		return studentRepository.findAll();
	}
	
}
