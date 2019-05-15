package com.bijay.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bijay.spring.mvc.dao.StudentDao;
import com.bijay.spring.mvc.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;

	public List<Student> findAll() {
		return studentDao.findAll();
	}

	public Student findOne(Long id) {
		return studentDao.findOne(id);
	}

	public void save(Student student) {
		studentDao.save(student);
	}

	public void update(Student student) {
		studentDao.update(student);
	}

	public void delete(Long id) {
		studentDao.delete(id);
	}
}
