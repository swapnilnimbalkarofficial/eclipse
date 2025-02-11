package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {
	public static void main(String args[]) {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap73", "root", "Swapnil@123");
			int check = 0;
			String sql = ("insert into t2(name, city)values(?,?)");
			pst = con.prepareStatement(sql);
			pst.setString(1, "vijay");
			pst.setString(2, "satara");
			check = pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}

}