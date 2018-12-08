<%@page import="java.util.ArrayList"%>
<%@page import="com.employee.model.Employee"%>
<%@page import="java.util.List"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<a herf="<%=application.getContextPath()%>/register-employee.jsp">ADD
			USER</a>
	</center>

	<%
	List<Employee> employeelist=(ArrayList<Employee>)application.getAttribute("registeredUser");
	
%>

	<p align="center">
		<b>Registered Users</b>
	</p>

	<% if(employeelist==null){ %>
	<p>not Available</p>
	<%} 
	else{ 	%>
	<table border="1" align="center">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>User Name</th>
			<th>Password</th>
		</tr>
		<%
				for(Employee employee:employeelist){
			%>
		<tr>
			<td><%=employee.getFirstName()%></td>
			<td><%=employee.getLastName()%></td>
			<td><%=employee.getUserName()%></td>
			<td><%=employee.getPassword()%></td>
		</tr>
		<% } %>
		
	</table>
	<%} %>
</body>
</html>