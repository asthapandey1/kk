package com.kk.dao;

import com.kk.entity.Login;
import com.kk.entity.User;

public interface UserDao {

	/**
	 * 
	 * @param user
	 */
	public boolean register(User user);

	/**
	 * 
	 * @param login
	 * @return
	 */
	public User validateUser(Login login);
}