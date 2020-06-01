<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
<link rel="stylesheet" href="css/style.css">
 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> JSP Servlet Example</title>
</head>

<body>
<header id="home" class="header">
		<nav class="nav" role="navigation">
			<div class="container nav-elements">
				<div class="branding">
					<a href="home"><img src="images/sclogo.png"
						alt="Logo"></a>
				</div>
				<!-- branding -->
				<ul class="navbar">
					 <li><a href="registerUser">new user?</a></li>
					<li><a href="login">login</a></li>
					<li><a href="Products">Products</a></li>
					<!-- <li><a href="viewProfile">view my profile</a></li> --> 
					<li><a href='About Us'>About Us</a></li>
					<li><a href="redirect">linkedIn</a></li>

				</ul>
				<!-- navbar -->
			</div>
			<!-- container nav-elements -->
		</nav>
		
	</header>

	<section id="login" class="section">
		<div class="container tagline">
			<% if(request.getAttribute("error")!=null){ %>
			<em><%=request.getAttribute("error")%></em><br />
			<%} %>
	
     
    <div align="center" style="margin-top: 50px;">
    
 	<h1>Welcome To Home page</h1>
 	 
 	        <form action="LoginServlet" method="post">
            Please enter your Username:  <input type="text" name="username" size="20px"> <br><br>
            Please enter your Password:  <input type="text" name="password" size="20px"> <br><br>
        <input type="submit" value="Login">  // not required
       
        </form>
 
    </div>
    </section>
    
</body>
</html>