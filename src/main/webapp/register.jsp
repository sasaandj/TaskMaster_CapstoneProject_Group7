<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>

	<h1>Create a TaskMaster Account</h1>
	<form action="RegisterServlet" method="post">

		First Name: <input type="text" name="firstName"><br/>
		<br /> Last Name: <input type="text" name="lastName" required><br />
		<br /> Email: <input type="text" name="email" required><br />
		<br /> Username: <input type="text" name="userName" required><br />
		<br /> Password: <input type="password" name="password" required><br />
		<br /> <input type="submit" name="register" value="Register"><br />
		<br /> <em><a href="login.jsp">Already have account? Login here</a></em>
	</form>
	
</body>
</html>
