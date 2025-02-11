package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDao {

	public static void main(String[] args) {
		Connection con= null;
		PreparedStatement pst=null;
		int check=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jap73", "root", "Swapnil@123");
			String sql=("insert into emp(name, city, designation) values(?,?,?)");
			pst=con.prepareStatement(sql);
			pst.setString(1, "uddhav");
			pst.setString(2, "solapur");
			pst.setString(3, "CA");
			pst.executeUpdate();
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
