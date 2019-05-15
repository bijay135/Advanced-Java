package com.bijay.spring.boot.service;

import java.util.List;

import com.bijay.spring.boot.model.Student;

public interface StudentService {

	List<Student> findAll();

	Student findOne(Long id);

	void saveOrUpdate(Student student);

	void delete(Long id);
}
