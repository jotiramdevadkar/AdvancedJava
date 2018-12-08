<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=application.getContextPath()%>/login-servlet" method="post" name="loginForm">
		<table width="25%" bgcolor="red" align="center">
			<tr>
				<th>Login Form</th>		
			</tr>
			<tr>
				<th>UserName:</th>
				<td><input type="text" size=25 name="userName"></td>
			</tr>
			<tr>
				<th>Password</th>
				<td><input type="text" size=25 name="password"></td>
			<tr>
			<tr>
				<td><button type="reset">Reset</button></td>
				<td><button type="submit">Submit</button>
			</td>
		</table>
	
	
	</form>
</body>
</html>