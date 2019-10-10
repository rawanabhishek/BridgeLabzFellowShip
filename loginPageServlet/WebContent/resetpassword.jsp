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
	margin-right: 500px;
	margin-left: 500px;
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
	width: 100%;
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
<title>Reset Password</title>
<link rel="shortcut icon" type="image/png" href="user.png">
</head>
<body>

<h2 align="center">Forgot Password</h2>
	<div class="imgcontainer">
		<img src="user.png" alt="Avatar" class="avatar">
	</div>
	
	<form action="reset" method="post">
		<div class="container">
		
		<input type="hidden" name="email"
							value="<%=request.getParameter("email")%>">
			<label for="newpassword"><b>new password</b></label> <input type="password"
				placeholder="new password" name="newpassword">
				
				<label for="confirmnewpassword"><b>confrim new password</b></label> <input type="password"
				placeholder="confirm new password" name="confirmnewpassword">

			<button type="submit">Reset Password</button>
		</div>

	</form>




</body>
</html>