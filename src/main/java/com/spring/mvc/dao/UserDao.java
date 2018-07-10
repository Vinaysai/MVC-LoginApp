package com.spring.mvc.dao;

import com.spring.mvc.bean.Login;
import com.spring.mvc.bean.User;

public interface UserDao {

	void register(User user);

	User validateUser(Login login);

}
