<%@page import="java.sql.ResultSet"%>
<%@page import="com.bridgelabz.servlet.dao.Dao"%>
<%@page import="com.bridgelabz.servlet.model.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<meta charset="UTF-8">
<style>
button {
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 30%;
}

button:hover {
	opacity: 0.8;
}

button.fixed {
	position: fixed;
	top: 10px;
	right: 10px;
	width: 150px;
	border: 3px solid #73AD21;
}
</style>

<head>
<title>Insert title here</title>
<link rel="shortcut icon" type="image/png" href="user.png"  >
</head>
<body>

	<%
	   
	    
		response.setHeader("Cache-Control", "no-cache ,no-store ,must-revalidate");
		if (session.getAttribute("userName") == null) {
			response.sendRedirect("login.jsp");

		}
		String name=String.valueOf(session.getAttribute("userName"));
		Dao dao=new Dao();
		User user=new User();
		
		ResultSet rs=dao.userData(name);
		while(rs.next()){
			user.setFirstName(rs.getString("first_name"));
			user.setLastName(rs.getString("last_name"));
			user.setUserName(rs.getString("username"));
			user.setEmail(rs.getString("email"));
			user.setContact(rs.getString("contact"));
			
		}
		
		
		
		
	%>
	<h2>
	<span>Welcome ${userName}</span>
		<form action="logout" method="post">

			

			<button type="submit" value="Logout" class="fixed">Logout</button>

		</form>
	</h2>










</body>
</html>