<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List User</title>
</head>
<body>
	 <div align="center">
	   <h3>List of User</h3>
	   <a href="${pageContext.request.contextPath}/addUserForm">Add User</a>
	   <table border="1" >
		<thead>
			<tr>
				<td>Id</td>
				<td>Name</td>
				<td>City</td>
				<td>Email</td>
				<td>Mobile</td>
				<td>Actions</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${users}">
				<tr>
					<td>${user.id}</td>
					<td>${user.name}</td>
					<td>${user.city}</td>
					<td>${user.email}</td>
					<td>${user.mobile}</td>
					<td>
					  <a href="${pageContext.request.contextPath}/deleteUser/${user.id}">delete</a>
					  <a href="${pageContext.request.contextPath}/updateUser/${user.id}">edit</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
	 </div>
</body>
</html>