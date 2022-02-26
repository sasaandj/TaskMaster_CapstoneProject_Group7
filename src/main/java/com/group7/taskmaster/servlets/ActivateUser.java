package com.group7.taskmaster.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.group7.taskmaster.dao.RegisterDAO;

public class ActivateUser extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RegisterDAO dao = new RegisterDAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");

		int status = 0;

		try {

			status = dao.getUserByEmail(email);

		} catch (SQLException e) {

			e.printStackTrace();
		}

		if (status > 0) {
			
			System.out.print("ERROR");
			
			
		} else {
			
			response.sendRedirect("login.jsp");
			PrintWriter write = response.getWriter();
			write.write("Your account is now active!");
		}
	}
}
