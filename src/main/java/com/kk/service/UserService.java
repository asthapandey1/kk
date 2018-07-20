package com.kk.service;

import com.kk.entity.Login;
import com.kk.entity.User;

public interface UserService {

	public boolean register(User user);

	public User validateUser(Login login);

}
