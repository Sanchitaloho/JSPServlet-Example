<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>

<html>
<link rel="stylesheet" href="css/style.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>

	<style type="text/css">
	body {
    background-image:
        url('https://cdn.crunchify.com/wp-content/uploads/2013/03/Crunchify.bg_.300.png');
	}
	</style>
<body>
<header id="home" class="header">
		<nav class="nav" role="navigation">
			<div class="container nav-elements">
				<div class="branding">
					<a href="#home"><img src="images/sclogo.png"
						alt="Logo"></a>
				</div>
				<!-- branding -->

				<ul class="navbar">
					<li><a href="home">home</a></li>
					<li><a href="orderHistory">order history</a></li>
					<li><a href="viewProfile">view my profile</a></li> 
								
					<li><a href='logout'>logout</a></li>
					<li><a href="redirect">linkedIn</a></li>

				</ul>
				<!-- navbar -->
			</div>
			<!-- container nav-elements -->
		</nav>
		
	</header>
	     
    <div align="center" style="margin-top: 50px;">
    
 	<h1>Simple Web Application using JSP/Servlet</h1>
 	 
 	<em>Welcome  to the Portal</em><br><br>
	
 <%
  String username = request.getParameter("username");
  out.println("Hello user: " + username);
  out.println("Last Logged in : "+ displayDate());
 %>
</div>
 <%!
	public String displayDate(){
	SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-mm-dd hh:mm");
	Date toDate = Calendar.getInstance().getTime();
	return dateFormat.format(toDate);
     }
 %>
</body>
</html>