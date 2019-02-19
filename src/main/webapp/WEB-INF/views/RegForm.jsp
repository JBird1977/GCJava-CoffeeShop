<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<title>Registration Form</title>
</head>
<body>
<h1> Registration Form: </h1>
<form action="/RegResult" method="post">
            <div class="form-group">
                <label for="Name">First Name</label>
                <input class="form-control" type = "text" id="fName" name="fName" required minlength="2" autocomplete="off">
            </div>
            <div class="form-group">
                <label for="lname">Last Name</label>
                <input class="form-control" id="lname" name="lName" required minlength="2" autocomplete="off">
            </div>
            <div class="form-group">
                <label for="email">E-Mail</label>
                <input class="form-control" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="gender">Gender</label>
                <input type="radio" id="gender" name="gender" value="male"> Male
                <input type="radio" id="gender" name="gender" value="female"> Female
                <input type="radio" id="gender" name="gender" value="other"> Other
            </div>
            <div class="form-group">
                <label for="age">Age</label>
                <input type="number" id="age" name="age">
            </div>
            
            
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required minlength="8">
            </div>
            <button type="submit" class="btn btn-primary" value="submit">Register</button>
        </form>
</body>
</html>