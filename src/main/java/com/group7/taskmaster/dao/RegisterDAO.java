package com.group7.taskmaster.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.group7.taskmaster.beans.RegisterUser;
import com.group7.taskmaster.beans.Users;
import com.group7.taskmaster.services.EmailServices;
import com.group7.taskmaster.services.UserServices;

public class RegisterDAO {

	private Connection connection = null;
	private String INSERT_USERS_SQL = "INSERT INTO users(firstName, lastName, email, userName, password) VALUES (?,?,?,?,?);";
	private String SELECT_USER_EMAIL_SQL = "SELECT email, status FROM users WHERE email=? AND status='0';";
	private String UPDATE_USER_STATUS_SQL = "UPDATE users SET status='1' WHERE email=?;";
	
	public RegisterDAO() {

	}
	
	public int insertUser(Users user) throws SQLException { 
		
		int rows = 0;
		
		try { 
			
			connection = DBConnection.getConnectionToDatabase();
			PreparedStatement ps = connection.prepareStatement(INSERT_USERS_SQL);
		
			ps.setString(1, user.getFirstName());
			ps.setString(2, user.getLastName());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getUserName());
			ps.setString(5, user.getPassword());
			
			rows = ps.executeUpdate();
			
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		return rows;
		
	}
	
	public int getUserByEmail(String email) throws SQLException {
		
		int rowUpdated = 0;
		
		try {
			
			connection = DBConnection.getConnectionToDatabase();
			PreparedStatement ps = connection.prepareStatement(SELECT_USER_EMAIL_SQL);
			
			ps.setString(1, email);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) { 
				
				ps = connection.prepareStatement(UPDATE_USER_STATUS_SQL);
				ps.setString(1, email);
				
				ps.executeUpdate();
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		return rowUpdated; 
		
	}
	
	
}