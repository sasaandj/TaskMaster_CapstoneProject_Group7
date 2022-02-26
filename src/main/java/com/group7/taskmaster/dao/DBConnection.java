package com.group7.taskmaster.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DBConnection {

    private static final String dbUser = "root";
    private static final String dbPassword = "Sandor12";
    private static final String conString = "jdbc:mysql://localhost:3309/taskmaster";


    
    public static Connection getConnectionToDatabase() throws ClassNotFoundException {
        
    	Connection connection = null;

        try {
        	
        	Class.forName("com.mysql.jdbc.Driver");
			// get hold of the DriverManager
			connection = DriverManager.getConnection(conString, dbUser, dbPassword);
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();

		}

		if (connection != null) {
			System.out.println("Connection made to DB!");
		}

        return connection;
    }



public static void main(String[] args) throws ClassNotFoundException {

	getConnectionToDatabase();
	
	}
}