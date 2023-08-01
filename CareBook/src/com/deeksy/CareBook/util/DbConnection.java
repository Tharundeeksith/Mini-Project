package com.deeksy.CareBook.util;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private static final String url = "jdbc:mysql://localhost:3306/health";
	private static final String userName = "root";
	private static final String passWord = "deeksith@28";
	public static Connection getConnection() throws SQLException{
		return  DriverManager.getConnection(url,userName,passWord);
	}
}