<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add USER</title>
</head>
<body>
    <div align="center">
        <h1>Add USER</h1>
        <form action="${pageContext.request.contextPath}/createUser" method="post">
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" placeholder="Enter Here" required="required"/></td>
            </tr>
            <tr>
                <td>Email:</td>
               <td><input type="email" name="email" placeholder="Enter Here" required="required"/></td>
            </tr>
            <tr>
               <td>Address:</td>
               <td><input type="text" name="city" placeholder="Enter Here" required="required"/></td>
            </tr>
            <tr>
                <td>Mobile:</td>
                 <td><input type="tel" name="mobile" placeholder="Enter Here" required="required"/></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form>
    </div>
</body>
</html>