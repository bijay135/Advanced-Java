package com.bijay.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadQuery {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bijay", "root", "12345");
			ResultSet rs = con.createStatement().executeQuery("select * from student");
			while (rs.next()) {
				System.out.print(rs.getString(1) + " | ");
				System.out.print(rs.getString(2) + " | ");
				System.out.print(rs.getString(3) + " | ");
				System.out.print(rs.getString(4) + "\n");
			}
		} catch (SQLException e) {
			e.getStackTrace();
		}
	}
}
