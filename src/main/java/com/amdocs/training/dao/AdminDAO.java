package com.amdocs.training.dao;

import java.util.List;

import com.amdocs.training.model.Admin;
import com.amdocs.training.model.User;

public interface AdminDAO {
	//boolean saveAdmin(Admin admin);
	List<User> findAll();
}
