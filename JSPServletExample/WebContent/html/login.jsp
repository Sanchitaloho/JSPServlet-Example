<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<link rel="stylesheet" href="css/style.css">
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Login Page</title>
</head>

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
					<li><a href="home">Home</a></li>
       				  <li><a href="#products">Products</a></li>
     				  <li><a href="#search">search</a></li>
       				 <li><a href="registerUser">new user?</a></li>
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
    
 	<h1>LOGIN TO THE APPLICATION </h1><br>
 	 
 	<!-- <em>LOGIN USER</em><br> -->
        <form action="login" method="post">
            Please enter your Username:  <input type="text" name="username" size="20px"> <br><br>
            Please enter your Password:  <input type="text" name="password" size="20px"> <br><br>
        <input type="submit" value="Login">
       
        </form>
 
    </div>
    </section>
    
</body>
</html>