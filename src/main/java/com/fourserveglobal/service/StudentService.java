package com.fourserveglobal.service;

import java.util.List;

import com.fourserveglobal.entity.Student;

public interface StudentService {
	
    List<Student> getAllStudent();
    Student saveStudent(Student student);
    Student getStudentById(Integer id);
    Student updateStudent(Student student );
    void deleteStudentById(Integer id);
}
