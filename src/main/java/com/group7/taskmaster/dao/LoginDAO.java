package com.group7.taskmaster.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.group7.taskmaster.beans.UserLogin;

public class LoginDAO {

	private Connection connection = null;
	private String GET_USER_SQL = "SELECT * from users WHERE email=? AND password=? AND status=1;";

	public LoginDAO() {

	}

	public String authorizeLogin(UserLogin user) {
		String userName = user.getUserName();
		String password = user.getPassword();

		try {

			connection = DBConnection.getConnectionToDatabase();
			PreparedStatement ps = connection.prepareStatement(GET_USER_SQL);

			ps.setString(1, userName);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) { 
				
				String userEmail = rs.getString(userName);
				String userPassword = rs.getString(password);
				
				if(userEmail.equalsIgnoreCase(userName) && userPassword.equalsIgnoreCase(password)) { 
					
					return "Login successful!";
				}
			}

		} catch (Exception e) {

			e.printStackTrace();

		}
		
		return "Incorrect username or password.";
	}

}
