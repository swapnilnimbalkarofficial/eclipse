package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {
	public static void main(String args[]) {
		Connection con = null;
		PreparedStatement pst = null;
		int check = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap73", "root", "Swapnil@123");
			String sql = ("insert into student(name,city) values(?,?)");
			pst = con.prepareStatement(sql);
			pst.setString(1, "swapnil");
			pst.setString(2, "pune");
			check = pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		try {
			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(check);
	}
}
