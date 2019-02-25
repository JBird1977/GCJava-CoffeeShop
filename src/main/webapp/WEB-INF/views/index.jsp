<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<title>Insert title here</title>
</head>
<body>
	<h1>Test</h1>
	<span>
      Hello ${ profile.firstName } (stored in session)
    </span>
	<p>
		<a href="RegForm">Registration Form</a>
		<a href="productList">Product List</a>
		<a href="UserInfo">User Info</a>
		<a href="Admin">Admin Console</a>
	</p>
</body>
</html>