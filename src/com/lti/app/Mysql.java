package com.lti.app;

import java.sql.*;
import java.util.Properties;

public class Mysql {
	public static void main(String[] args) {

		Connection conn = null;
		
		try {
			String username = "root";
			String password = "rohit";
			String url = "jdbc:mysql://localhost/sonoo";
			
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			Properties connectionProps = new Properties();
			connectionProps.put("user", username);
			connectionProps.put("password", password);
			
			conn = DriverManager.getConnection(url, connectionProps);
			
			System.out.println("Database connection successful !");
			
			// statements
			Statement s = conn.createStatement();
			
//			s.executeUpdate("INSERT INTO Student (regNo, name, degree, semester) VALUES (2, 'ravi', 'B.Tech', 6);");
			
			ResultSet result = s.executeQuery("SELECT * FROM Student");
			
			System.out.println("id name	degree semester");
			while(result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " " + result.getInt(4));
			}
		}
		catch (Exception e) {
			System.err.println("Failed to connect to database " + e);
		}
		finally {
			if(conn != null) {
				try {
					conn.close();
				}
				catch (SQLException e) {}
			}
		}
	}
}
