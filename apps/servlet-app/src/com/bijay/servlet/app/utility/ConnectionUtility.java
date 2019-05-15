package com.bijay.servlet.app.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {
	private static Connection connection;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if (connection == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet-app", "root", "12345");
		}
		return connection;
	}
	
	public static void closeConnection() throws SQLException {
		if(connection!=null) {
			connection.close();
			connection = null;
		}
	}

}
