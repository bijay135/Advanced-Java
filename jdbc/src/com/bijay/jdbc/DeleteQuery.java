package com.bijay.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeleteQuery {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bijay", "root", "12345");
			con.createStatement().executeUpdate("delete from student where id=1");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
