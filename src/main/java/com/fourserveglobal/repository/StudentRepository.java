package com.fourserveglobal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fourserveglobal.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
