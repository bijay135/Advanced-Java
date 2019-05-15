package com.bijay.spring.boot.service;

import com.bijay.spring.boot.model.User;

public interface UserService {

	User findOneByEmail(String email);

	void saveOrUpdate(User user);
}
