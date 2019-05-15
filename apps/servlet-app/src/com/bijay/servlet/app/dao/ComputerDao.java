package com.bijay.servlet.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bijay.servlet.app.dto.Computer;
import com.bijay.servlet.app.utility.ConnectionUtility;

public class ComputerDao {
	public List<Computer> findByPrice(int price) {
		List<Computer> computers = new ArrayList<>();
		try {
			Connection con = ConnectionUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from computer where price = ?");
			ps.setInt(1,price);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Computer computer = new Computer();
				computer.setCasing(rs.getString("casing"));
				computer.setMotherboard(rs.getString("motherboard"));
				computer.setCpu(rs.getString("cpu"));
				computer.setGpu(rs.getString("gpu"));
				computer.setRam(rs.getString("ram"));
				computer.setStorage(rs.getString("storage"));
				computer.setPowersupply(rs.getString("powersupply"));
				computers.add(computer);
			}
			ConnectionUtility.closeConnection();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return computers;
	}
}
