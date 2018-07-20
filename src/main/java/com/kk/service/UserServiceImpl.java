package com.kk.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.kk.dao.UserDao;
import com.kk.entity.Login;
import com.kk.entity.User;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public boolean register(User user) {
		boolean result = userDao.register(user);
		if (!result) {

		} else {

		}
		return result;
	}

	public User validateUser(Login login) {
		return userDao.validateUser(login);
	}

}
