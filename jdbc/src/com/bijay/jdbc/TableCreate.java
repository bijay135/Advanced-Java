package com.bijay.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TableCreate {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bijay", "root", "12345");
			StringBuilder sql = new StringBuilder();
			sql.append("create table student (");
			sql.append("id int(11) not null auto_increment,");
			sql.append("name varchar(100) not null,");
			sql.append("age tinyint(4) not null,");
			sql.append("gender enum('male','female') not null,");
			sql.append("address varchar(100) not null,");
			sql.append("phoneno varchar(20) not null,");
			sql.append("primary key (id)");
			sql.append(")");
			con.createStatement().executeUpdate(sql.toString());
			System.out.println("Table created successfully.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
