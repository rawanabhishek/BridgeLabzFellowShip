<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


<meta charset="UTF-8">
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

form {
	border: 3px solid #f1f1f1;
	margin-top: 30px;
	margin-bottom: 100px;
	margin-right: 450px;
	margin-left: 450px;
}

input[type=text], input[type=password] {
	width: 100%;
	padding: 12px 20px;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

button {
	background-color: #4CAF50;
	align: middle;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 50%;
}

button:hover {
	opacity: 0.8;
}

.cancelbtn {
	width: auto;
	padding: 10px 18px;
	background-color: #f44336;
}

.imgcontainer {
	text-align: center;
	margin: 24px 0 12px 0;
}

img.avatar {
	width: 15%;
	border-radius: 50%;
}

.container {
	padding: 16px;
}

span.psw {
	float: right;
	padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
	span.psw {
		display: block;
		float: none;
	}
	.cancelbtn {
		width: 50%;
	}
}
</style>
<head>

<title>registeration page</title>
<link rel="shortcut icon" type="image/png" href="born.png"  >
</head>
<body>

<h2 align="center">Registeration Form</h2>

<div class="imgcontainer">
			<img src="beared.jpg" alt="Avatar" class="avatar">
		</div>
	<form action="register" method="post">
	


		<div class="container">
			<label for="fname"><b>First Name</b></label> <input type="text"
				placeholder="Enter Firstname" name="fname" required> <label
				for="lname"><b>Last Name</b></label> <input type="text"
				placeholder="Enter Lastname" name="lname" required> <label
				for="username"><b>Username</b></label> <input type="text"
				placeholder="Enter Username" name="username" required> <label
				for="email"><b>Email</b></label> <input type="text"
				placeholder="Enter Email" name="email" required> <label
				for="contact"><b>Contact</b></label> <input type="text"
				placeholder="Enter Contact" name="contact" required> <label
				for="pass"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="pass" required>

			<button type="submit">Register</button>

		</div>


	</form>








</body>
</html>