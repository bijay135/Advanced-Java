package com.bijay.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertQuery {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bijay", "root", "12345");
			con.createStatement().executeUpdate("Insert into student (name,roll,phone,email) values('bijay','12345','987654321','bijay@gmail.com')");
			System.out.println("Successfully Inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
