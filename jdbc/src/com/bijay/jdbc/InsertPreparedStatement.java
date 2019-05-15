package com.bijay.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPreparedStatement {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bijay", "root", "12345");
			PreparedStatement preparedStatement = con.prepareStatement("Insert into student values (null, ?, ?, ?, ?, ?)");
			preparedStatement.setString(1, "Bijay Shah");
			preparedStatement.setByte(2, (byte)22);
			preparedStatement.setString(3, "Male");
			preparedStatement.setString(4, "Bhaktapur");
			preparedStatement.setString(5, "123456789");
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
