<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form name="loginForm" action="loginRegister" method="post">
		<table style="background-color: skyblue; margin-left: 20px; margin-left: 20px">
			<tr>
				<td><h3 style="color: red">Login Page !!!</h3></td>
				<td></td>
			</tr>
			<tr>
				<td>UserName:</td>
				<td><input type="text" name="username" size="30" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" size="30" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Login" /></td>
				<td><a href="register.jsp">Registration</a></td>
			</tr>
		</table>
	</form>
</body>
</html>