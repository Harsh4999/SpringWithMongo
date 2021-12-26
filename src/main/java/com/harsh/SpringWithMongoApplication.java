package com.harsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWithMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWithMongoApplication.class, args);
	}
	
//	@Bean
//	CommandLineRunner runner(StudentRepository repository,
//			MongoTemplate mongoTemplate) {
//	
//		return args->{
//			Address address = new Address("India","Rajkot","360001");
//			Student student = new Student("Rahul","trivedi",Gender.MALE,
//					address,List.of("Cs"),BigDecimal.TEN,LocalDateTime.now());
////			repository.findByFirstName(student.getFirstName())
////			.ifPresentOrElse(s->{
////				System.out.println(s+ " Student already exists");
////			}, ()->{
////				System.out.println("Student being added");
////				repository.save(student);
////			});
//			if(repository.findStudentByFirstName(student.getFirstName()).get()!=null) {
//				System.out.println("Student already exists");
//			}else {
//				repository.save(student);
//			}
//			//			Query query = new Query();
////			query.addCriteria(Criteria.where("firstName").is(student.getFirstName()));
////			List<Student> students = mongoTemplate.find(query,Student.class);
////			if(students.size()>1) {
////				throw new IllegalStateException("Found Many Students");
////			}
////			if(students.isEmpty()) {
////				repository.insert(student);
////			}else {
////				System.out.println(students.get(0).getFirstName());
////			}
//			
//		};
//	}

}
