package com.amdocs.training.client;

import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.dao.impl.UserDAOImpl;
import com.amdocs.training.model.User;
public class UserClient {
public static void main(String[] args) {
	
		UserDAO dao = new UserDAOImpl();
		User user = new User(211, "Gaurav", 9586234712L,"gaurav@gmail.com","dhule","2020-11-21","gaurav","img2.jpg");
		if(dao.saveUser(user)) {
		System.out.println("User Added Successfully");
		}
		else {
		System.out.println("Error Cannot Insert");
		}
	}
}