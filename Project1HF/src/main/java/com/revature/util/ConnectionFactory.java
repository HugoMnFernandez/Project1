package com.revature.util;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	private static final String filename= "/Project1HF/src/main/resources/datasource.properties";
	
	private static ConnectionFactory cf = null;
	private static String url;
	private static String user;
	private static String password;
	
	
	private ConnectionFactory() {
		
		
		try {
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream(filename);
			prop.load(fis);
			url = prop.getProperty("url");
			user = prop.getProperty("user");
			password = prop.getProperty("password");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public synchronized static ConnectionFactory getConnectionFactory() {
		if(cf == null) {
			cf = new ConnectionFactory();
		}
		return cf;
	}
	
	public Connection createConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("Unable to reach DataBase");
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
