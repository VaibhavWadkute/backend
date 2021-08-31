package com.amdocs.training.client;

import com.amdocs.training.dao.AdminDAO;
import com.amdocs.training.dao.impl.AdminDAOImpl;
import com.amdocs.training.model.Admin;
public class AdminClient {
public static void main(String[] args) {
	
		AdminDAO dao = new AdminDAOImpl();
		Admin admin = new Admin(100,"admin2", "admin2@123", "admin2@gmail.com");
		if(dao.saveAdmin(admin)) {
		System.out.println("Admin Added Successfully");
		}
		else {
		System.out.println("Error Cannot Insert");
		}
	}
}