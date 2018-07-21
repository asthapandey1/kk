package com.kk.service;

import com.kk.dao.UserDao;
import com.kk.dao.UserDaoImpl;
import com.kk.entity.Login;
import com.kk.entity.User;

public class UserServiceImpl implements UserService {

	private UserDao userDao = new UserDaoImpl();

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
