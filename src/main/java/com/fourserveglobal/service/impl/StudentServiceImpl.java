package com.fourserveglobal.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fourserveglobal.entity.Student;
import com.fourserveglobal.repository.StudentRepository;
import com.fourserveglobal.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;
	

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudent() {
		
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Integer id) {
		
		return studentRepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public void deleteStudentById(Integer id) {
		studentRepository.deleteById(id);
		
	}
	
	
	
	
	

}
