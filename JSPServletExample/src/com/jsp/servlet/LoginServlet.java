package com.jsp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//dispatch the request to login.jsp resource
		RequestDispatcher dispatcher=req.getRequestDispatcher("/html/login.jsp"); //goto
		dispatcher.include(req, resp);
	
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
  	  String username = req.getParameter("username");
  	  String password = req.getParameter("password");
  	  if (username.isEmpty() || password.isEmpty()) {
  		  res.sendRedirect("login.jsp?");
  	  } else {
  	   res.sendRedirect("WelcomePage.jsp?username="+username);
  	  }
  	  
  	 }

}
