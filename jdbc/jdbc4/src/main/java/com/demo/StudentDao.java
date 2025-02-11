package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {
	PreparedStatement pst = null;
	Connection con = null;

	public void insertStudent() {
		int check = 0;

		String url = "jdbc:mysql://localhost:3306/jap73";
		String uname = "root";
		String pwd = "Swapnil@123";

		String sql = "insert into student(name,city,percentage) value(?,?,?)";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url, uname, pwd);
			pst = con.prepareStatement(sql);
			pst.setString(1, "sachin");
			pst.setString(2, "katraj");
			pst.setDouble(3, 87);

			check = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				pst.close();
				con.close();

			} catch (Exception e2) {
				// TODO: handle exception

			}
		}

	}

	public void delete() {

		String url = "jdbc:mysql://localhost:3306/jap73";
		String uname = "root";
		String pwd = "Swapnil@123";

		String sql = "delete from student where id =23";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url, uname, pwd);
			pst = con.prepareStatement(sql);

			pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {

				pst.close();

				con.close();

			} catch (Exception e2) {
				// TODO: handle exception

			}
		}
	}
}
