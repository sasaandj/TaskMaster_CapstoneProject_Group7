package com.group7.taskmaster.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.group7.taskmaster.beans.RegisterUser;
import com.group7.taskmaster.dao.RegisterDAO;
import com.group7.taskmaster.services.EmailServices;

public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RegisterUser user;
	private RegisterDAO dao = new RegisterDAO();

	public RegisterServlet() {
		super();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	           throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		
		user = new RegisterUser(firstName, lastName, email, userName, password);

		int rows;

		try {

			rows = dao.insertUser(user);
			
			if (rows==0) {
				
				PrintWriter writer = response.getWriter();
				writer.write("Unable to register user!");
				
		
			} else {
				
				EmailServices es = new EmailServices(email);
				es.sendEmail();
				System.out.print("Email sent!");
				response.sendRedirect("http://localhost:8081/TaskMaster_CapstoneProject_Group7/verify.jsp");
				
			}
			

		} catch (SQLException e) {

			e.printStackTrace();

		}

	

	}

}
