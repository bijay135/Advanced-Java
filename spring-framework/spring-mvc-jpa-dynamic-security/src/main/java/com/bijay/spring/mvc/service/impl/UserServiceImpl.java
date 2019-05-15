package com.bijay.spring.mvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bijay.spring.mvc.model.User;
import com.bijay.spring.mvc.repository.UserRepository;
import com.bijay.spring.mvc.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User findOneByEmail(String email) {
		return userRepository.findOneByEmail(email);
	}

	@Override
	public void saveOrUpdate(User user) {
		userRepository.save(user);
	}
}
