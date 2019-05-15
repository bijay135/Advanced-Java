package com.bijay.spring.mvc.service;

import com.bijay.spring.mvc.model.User;

public interface UserService {

	User findOneByEmail(String email);

	void saveOrUpdate(User user);
}
