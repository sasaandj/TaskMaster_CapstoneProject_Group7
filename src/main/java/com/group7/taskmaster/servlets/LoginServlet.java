package com.group7.taskmaster.servlets;

import com.group7.taskmaster.beans.UserLogin;
import com.group7.taskmaster.beans.Users;
import com.group7.taskmaster.dao.LoginDAO;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private LoginDAO dao = new LoginDAO() ; 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		UserLogin user = new UserLogin(userName, password);
		
		String login = dao.authorizeLogin(user);
		
		if(login.equals("Login successful!")) { 
			HttpSession session = request.getSession(true);
			
			session.setAttribute("userName", user.getEmail());
			
		}
		
		
		
		
		

	}
}
