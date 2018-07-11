package com.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.mvc.bean.Login;
import com.spring.mvc.bean.User;
import com.spring.mvc.dao.UserDao;

public class UserServiceImpl implements UserService {

	@Autowired
	public UserDao userDao;

	@Override
	public void register(User user) {

		userDao.register(user);

	}

	@Override
	public User validateUser(Login login) {

		return userDao.validateUser(login);
	}

}
