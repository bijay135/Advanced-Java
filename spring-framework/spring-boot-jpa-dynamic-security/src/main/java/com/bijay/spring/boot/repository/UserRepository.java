package com.bijay.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bijay.spring.boot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findOneByEmail(String email);

	User findOneByEmailAndPassword(String email, String password);
}
