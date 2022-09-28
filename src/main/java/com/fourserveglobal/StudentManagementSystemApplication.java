package com.fourserveglobal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fourserveglobal.entity.Student;
import com.fourserveglobal.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
		System.out.println("Hello");
	}
	
	@Autowired
	private StudentRepository studentRepository;
	/*
	 * @Override public void run(String... args) throws Exception { Student s1=new
	 * Student("Mahesh", "Deore", "mahesh@gmail.com"); studentRepository.save(s1);
	 * 
	 * Student s2=new Student("Ravi", "Kumar", "ravi@gmail.com");
	 * studentRepository.save(s2);
	 * 
	 * Student s3=new Student("Mahesh", "Marri", "mahesh123@gmail.com");
	 * studentRepository.save(s3);
	 * 
	 * Student s4=new Student("Ashish", "Kumar", "ashish@gmail.com");
	 * studentRepository.save(s4);
	 * 
	 * Student s5=new Student("Deepak", "Lakde", "deepak@gmail.com");
	 * studentRepository.save(s5);
	 * 
	 * }
	 */

}
