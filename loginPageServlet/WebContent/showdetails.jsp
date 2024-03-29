<%@page import="java.sql.ResultSet"%>
<%@page import="com.bridgelabz.servlet.model.User"%>
<%@page import="com.bridgelabz.servlet.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<meta charset="UTF-8">
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}

button {
	background-color: #4CAF50;
	align: middle;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 45%;
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
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache ,no-store ,must-revalidate");
		if (session.getAttribute("userName") == null) {
			response.sendRedirect("login.jsp");

		}
		String name = String.valueOf(session.getAttribute("userName"));
		Dao dao = new Dao();
		User user = new User();

		ResultSet rs = dao.userData(name);
		while (rs.next()) {
			user.setFirstName(rs.getString("first_name"));
			user.setLastName(rs.getString("last_name"));
			user.setUserName(rs.getString("username"));
			user.setEmail(rs.getString("email"));
			user.setContact(rs.getString("contact"));
			user.setDateUpdate(rs.getString("dateupdated"));

		}
	%>

	<h2>
		${userName}
		<form action="logout" method="post">
			<button type="submit" value="Logout"  class ="fixed">Logout</button>
		</form>
	</h2>

	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>UserName</th>
			<th>Email</th>
			<th>Contact</th>
			<th>Date Updated</th>
		</tr>
		<tr>
			<td>
				<%
					out.print(user.getFirstName());
				%>
			</td>
			<td>
				<%
					out.print(user.getLastName());
				%>
			</td>
			<td>
				<%
					out.print(user.getUserName());
				%>
			</td>
			<td>
				<%
					out.print(user.getEmail());
				%>
			</td>
			<td>
				<%
					out.print(user.getContact());
				%>
			</td>
			<td>
				<%
					out.print(user.getDateUpdate());
				%>
			</td>

		</tr>

	</table>


</body>
</html>