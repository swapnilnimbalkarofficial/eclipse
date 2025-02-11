package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
    	Connection con=null;
    	PreparedStatement pst = null;
    	int check = 0;
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap73","root", "Swapnil@123");
			String sql = "insert into t1(name, city) values(?,?)";
			pst = con.prepareStatement(sql);
			pst.setString(1, "DEF");
			pst.setString(2, "Satara");
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
        System.out.println(check);
    }
}
 