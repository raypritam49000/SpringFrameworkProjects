<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of User</title>
<%@ include file="bootstrap.jsp"%>
</head>
<body>
	<div class="container mt-5 shadow text-center">
	   <h3> <a class="btn btn-outline-success" href="${pageContext.request.contextPath}/addUser">Add</a></h3>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">NAME</th>
					<th scope="col">CITY</th>
					<th scope="col">SALARY</th>
					<th scope="col">ACTIONS</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${users}">
					<tr>
						<th scope="row">${user.id}</th>
						<td>${user.name}</td>
						<td>${user.city}</td>
						<td>${user.salary}</td>
						<td>
						 <a class="btn btn-outline-primary" href="${pageContext.request.contextPath}/updateUser/${user.id}">Edit</a>
						 <a class="btn btn-outline-danger" href="${pageContext.request.contextPath}/deleteUser/${user.id}">Delete</a>
						</td>
					</tr>

				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>