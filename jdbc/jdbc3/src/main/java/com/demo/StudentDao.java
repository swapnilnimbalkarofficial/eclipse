package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Student;

public class StudentDao {
	public int deleteStudentById(int id)
	{
		int check=0;
		Connection con = null;
		PreparedStatement pst= null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jap73", "root", "Swapnil@123");
//			String sql = "insert into student_app (student_name,student_city,student_percentage) values(?,?,?)";
			String sql = "delete from student_app where id=?";
			pst =con.prepareStatement(sql);
//			pst.setString(1, s.getName());
//			pst.setString(2, s.getCity());
//			pst.setDouble(3, s.getPercentage());
			pst.setInt(1, id);
			check = pst.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace(); 
		}finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return check;
	}
	
}

