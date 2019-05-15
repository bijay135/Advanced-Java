package com.bijay.spring.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bijay.spring.mvc.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findOneByEmail(String email);

	User findOneByEmailAndPassword(String email, String password);
}
