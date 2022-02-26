package com.group7.taskmaster.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TaskServlet extends HttpServlet {



	private static final long serialVersionUID = 1L;
	
	  @Override 
	  protected void doGet(HttpServletRequest request,
	  		  HttpServletResponse response) throws ServletException, IOException {
		  
		  String taskHome = "index.html";
		  RequestDispatcher dispatcher = request.getRequestDispatcher(taskHome);
		  dispatcher.forward(request, response);
	  
	  }
	  
	  
	  @Override
		 protected void doPost(HttpServletRequest request, HttpServletResponse response)
		           throws ServletException, IOException {
		  
	  }

}
