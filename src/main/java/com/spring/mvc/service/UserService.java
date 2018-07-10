package com.spring.mvc.service;

import com.spring.mvc.bean.Login;
import com.spring.mvc.bean.User;

public interface UserService {

	void register(User user);

	User validateUser(Login login);

}
