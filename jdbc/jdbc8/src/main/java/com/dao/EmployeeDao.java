package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDao {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pst=null;
		int check=0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Diver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jap73", "root", "Swapnil@123");
			String sql="insert into emp(name, city, designation) values(?,?,?)";
			pst=con.prepareStatement(sql);
			pst.setString(1, "anand");
			pst.setString(2, "katraj");
			pst.setString(3, "hr");
			check=pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(check);
	
	}

}