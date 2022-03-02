<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<h2>Reset Your Password</h2>
	<p>
	Please enter your login email, we'll send a new random password to your inbox:
	</p>
	
	<form id="resetForm" action="ForgotPasswordServlet" method="post">
		<table>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" id="email" size="20"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit">Send me a new password</button>
				</td>
			</tr>
		</table>
	
	</form>


</div>

</body>
</html>
