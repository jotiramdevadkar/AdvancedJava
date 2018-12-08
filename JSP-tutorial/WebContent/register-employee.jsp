<%@page import="com.sun.xml.internal.bind.CycleRecoverable.Context"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="<%=application.getContextPath()%>/register-employee" method="post" name="register-employeeform">
		<table width=25% align="center", bgcolor="cyan">
			<tr>
				<td colspan=2><center>
						<font size=4><b>Register Employee</b></font>
					</center></td>
			</tr>
			
			<tr>
				<th>First Name:</th>
				<td><input type="text" size=25 name="firstName"></td>
			</tr>
			<tr>
				<th>last Name:</th>
				<td><input type="text" size=25 name="lastName"></td>
			</tr>
			<tr>
				<th>UserName:</th>
				<td><input type="text" size=25 name="userName"></td>
			</tr>
			<tr>
				<th>Password:</th>
				<td><input type="password" size=25 name="passwod"></td>
			</tr>
				<td><button type="reset" >Reset</button></td>
				<td><button type="submit" value="Submit">Submit</button></td>
			
			
		</table>
	
	
	
	
	</form>
</body>
</html>