package com.bijay.servlet.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bijay.servlet.app.dto.User;
import com.bijay.servlet.app.utility.ConnectionUtility;

public class UserDao {
	public User findByUsernamePassword(String username, String password) {
		User user = null;
		try {
			Connection con = ConnectionUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from user where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
			}
			ConnectionUtility.closeConnection();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
}
