<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BORAJI.COM</title>
</head>
<body>
	<h2>Spring Security 4 - Custom login form example</h2>
	<hr />
	<h4>${message}</h4>
	<br>
	<a href="${pageContext.request.contextPath}/signout" >Logout</a>
</body>
</html>