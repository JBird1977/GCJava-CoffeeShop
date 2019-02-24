<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <!-- Hello, ${user.fName} -->
    <table class="table">
            <thead>
                <tr>
                    <th>First Name</th><th>Last Name</th><th>Email</th><th>Gender</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="user" items="${user}">
                <tr>
                    <td>${user.fname}</td>
                    <td>${user.lname}</td>
                    <td>${user.email}</td>
                    <td>${user.gender}</td>
                    
                </tr>
                </c:forEach>
            </tbody>
        </table>

</body>
</html>