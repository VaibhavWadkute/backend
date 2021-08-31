package com.amdocs.training.dao;

import com.amdocs.training.model.User;

public interface UserDAO {
	boolean saveUser(User user);
	User validateUser(String username, String password);
}
