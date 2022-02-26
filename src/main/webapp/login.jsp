<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to TaskMaster!</title>
</head>
<body>

	<h1>Please login</h1>
	<form action="LoginServlet" method="post">
		<br /> Username: <input type="text" name="userName" required><br />
		<br /> Password: <input type="password" name="password" required><br />
		<br /> <input type="submit" name="login" value="login"><br />
	</form>
	
</body>
</html>