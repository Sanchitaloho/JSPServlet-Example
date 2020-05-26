package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class HelloUser extends HttpServlet {
	
	/*  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	//this is a to dis*lay the parameters on screen through a servlet
        
    	// reading the user input
   		String username = request.getParameter("username");
        String password = request.getParameter("password");
      
    	
        PrintWriter out = response.getWriter();
        out.println (
                  "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" +" +
                      "http://www.w3.org/TR/html4/loose.dtd\">\n" +
                  "<html> \n" +
                  
                    "<head> \n" +
                      "<meta http-equiv=\"Content-Type\" content=\"text/html; " +
                        "charset=ISO-8859-1\"> \n" +
                      "<title>  JSP Servlet Example  </title> \n" +
                    "</head> \n" +
                    "<body> <div align='center'> \n" 
                     + "<style>\r\n" + 
                     
                     "</style>"+
                       "<h1 class=\"headline\">This is the value you entered</h1>"+
                    "<style= \"font-size=\"40px\" color='black'\"" + "\">" +
                     " <h2>  Username: " + username + "\n"+" <br> " + 
                        "Password: " + password +
                    "</font></body> \n" +
                  "</html>" 
                );      
        } */
   /**/ public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
    	  String username = req.getParameter("username");
    	  String password = req.getParameter("password");
    	  if (username.isEmpty() || password.isEmpty()) {
    		  res.sendRedirect("home.jsp?");
    	  } else {
    	   res.sendRedirect("WelcomePage.jsp?username="+username);
    	  }
    	  
    	 }
}