package com.spring.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String userName = "root";
		String password = "admin";
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/player?autoReconnect=true&useSSL=false&createDatabaseIfNotExist=true";

		String driver = "com.mysql.cj.jdbc.Driver";
		
		Connection connection = null ;
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(jdbcUrl,userName,password);
			
			System.out.println("DB created || DB connect successfully...");
			
		} catch (Exception e) {
			System.out.println("Error: "+e.toString()+" => "+e.getMessage());
		} finally {
			connection.close();
		}
	}

}
