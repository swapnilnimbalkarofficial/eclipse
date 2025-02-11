package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Student;

public class StudentDao {

	public int insertStudent(Student s) {
		Connection con = null;
		PreparedStatement pst=null;
		int check=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jap73", "root", "Swapnil@123");
			String sql="insert into Student(name, city, percentage) values(?,?,?)";
			pst=con.prepareStatement(sql);
			pst.setString(1, s.getName());
			pst.setString(2, s.getCity());
			pst.setDouble(3, s.getPercentage());
			check=pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println(check);
		}
		return check;
	}

}
