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
<h1>Login</h1>
        <form action="/Login" method="post">
            <div class="form-group">
                <label for="username">User Name</label>
                <input class="form-control" type = "text" id="username" name="username" required autocomplete="off">
            </div>

            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>
            </div>
            <button type="submit" class="btn btn-primary" value="submit">Submit</button> 
        </form>
      
    <a href="/" class="btn btn-secondary">Home</a>
</body>
</html>