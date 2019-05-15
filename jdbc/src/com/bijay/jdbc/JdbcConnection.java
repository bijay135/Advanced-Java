package com.bijay.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	public static void main(String[] args) {
		try {
			DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "12345");
			System.out.println("Database Connection Successfull");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
