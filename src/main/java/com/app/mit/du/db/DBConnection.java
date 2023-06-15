package com.app.mit.du.db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBConnection {

	public Connection getFileFromResources() {

		Properties prop = new Properties();
		try {
//			prop.load(getClass().getResourceAsStream("G:\\workspace\\SocialMediaApps\\src\\main\\resources\\application.properties"));

//			String dname = (String)prop.get("ds.driver");
//
//			String dbConnUrl = (String)prop.get("ds.url");
//			String dbUserName = (String)prop.get("ds.username");
//			String dbPassword = (String)prop.get("ds.password");

			String dname = "com.mysql.cj.jdbc.Driver";

			String dbConnUrl = "jdbc:mysql://localhost:3306/storydata?autoReconnect=true&verifyServerCertificate=false&useSSL=false";
			String dbUserName = "root";
			String dbPassword = "bjit1234";
			Class.forName(dname);
			Connection dbConn = DriverManager.getConnection(dbConnUrl,
															dbUserName, dbPassword);
			System.out.println(
					"Connection Established successfully");
			if (dbConn != null) {
				System.out.println("Connection Successful");
			}
			else {
				System.out.println("Failed to make connection!");
			}
			return dbConn;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void close(Connection conn)
	{
		if (conn != null) {
			try {
				conn.close();
			}
			catch (SQLException e) {
				System.out.println("SQL Exception in close connection method");
			}
		}
	}

	public static void close(Statement stmt)
	{
		if (stmt != null) {
			try {
				stmt.close();
			}
			catch (SQLException e) {
				System.out.println("SQL Exception in close statement method");
			}
		}
	}

	public static void close(ResultSet rSet)
	{
		if (rSet != null) {
			try {
				rSet.close();
			}
			catch (SQLException e) {
				System.out.println("SQL Exception in close resultset method");
			}
		}
	}
}
