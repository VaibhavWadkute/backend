package com.amdocs.training.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.amdocs.training.dao.AdminDAO;
import com.amdocs.training.db.DataSourceUtil;
import com.amdocs.training.model.Admin;
import com.amdocs.training.model.User;
public class AdminDAOImpl implements AdminDAO {
	
	DataSource dataSource = DataSourceUtil.dataSource();
	Connection conn = null;
	/*@Override
	public boolean saveAdmin(Admin admin) {
		String query = "insert into admin values(?,?,?,?)";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, admin.getId());
			ps.setString(2, admin.getName());
			ps.setString(3, admin.getPassword());
			ps.setString(4, admin.getEmail());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}*/
	@Override
	public List<User> findAll() {
		
		User user = new User();
		List<User> list = new ArrayList<User>();
		String sql = "select * from user";
		try {
			Connection conn = dataSource.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while(rs.next()) {
				user.setUser_id(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setPhone_no(rs.getLong(3));
				user.setEmail(rs.getString(4));
				user.setAddress(rs.getString(5));
				user.setReg_date(rs.getString(6));
				user.setPassword(rs.getString(7));
				user.setUpload_photo(rs.getString(8));
				list.add(user);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
