<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<form action="loginRegister" method="post">
		<table
			style="background-color: lightgreen; margin-left: 20px; margin-left: 20px">
			<tr>
				<td><h3 style="color: red">Registration Page !!!</h3></td>
				<td></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" size="30" /></td>
			</tr>
			<tr>
				<td>UserName:</td>
				<td><input type="text" name="username" size="30" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password1" size="30" /></td>
			</tr>
			<tr>
				<td>Re-Type Password:</td>
				<td><input type="password" name="password2" size="30" /></td>
			</tr>
			<tr>
				<td>Email Address:</td>
				<td><input type="text" name="email" size="30" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td>
				<input type="radio" name="gender" />Male 
				<input type="radio" name="gender" />Female</td>
			</tr>
			<tr>
				<td>City:</td>
				<td><select name="city">
						<option value="">Choose your city...</option>
						<option value="CLE">Cleveland</option>
						<option value="CA">California</option>
						<option value="NY">New York</option>
						<option value="BO">Boston</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="register" /></td>
			</tr>
		</table>
	</form>
</body>
</html>