package com.bijay.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseCreate {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "12345");
			con.createStatement().executeUpdate("create database bijay");
			System.out.println("Database created successfully.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
