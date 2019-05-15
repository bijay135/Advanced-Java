package com.bijay.spring.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bijay.spring.mvc.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
