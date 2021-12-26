package com.harsh.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.harsh.resources.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student,String>{
	Optional<Student> findByFirstName(String firstName);
	
	@Query(value = "{'firstName': ?0}")
	Optional<Student> findStudentByFirstName(String firstName);
}
