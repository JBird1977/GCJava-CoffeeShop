<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
</head>
<body>

<div class="container">
    <span>
      Hello ${ profile.firstName } (stored in session)
    </span>
        <h1>User Info</h1>
        <table class="table">
            <thead>
                <tr>
                    <th>First Name</th><th>Last Name</th><th>Email</th><th>Gender</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="user" items="${user}">
                <tr>
                    <td><a href="/UserInfo/${user.id}">${user.userName}</a></td>
                    <td>${user.firstName}</td>
                    <td>${user.lastName}</td>
                    <td>${user.email}</td>
                    <td>${user.gender}</td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
          <a href="/RegForm" class="btn btn-secondary">Add User</a>
          <a href="/" class="btn btn-secondary">Home</a>
    </div>

</body>
</html>