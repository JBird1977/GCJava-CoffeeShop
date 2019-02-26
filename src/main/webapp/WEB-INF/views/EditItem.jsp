<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method=post>
            <div class="form-group">
                <label for="name">Name</label>
                <input class="form-control" type = "text" id="name" name="name" value=${product.name} required  autocomplete="off">
            </div>
            <div class="form-group">
                <label for="description">Description</label>
                <input class="form-control" type = "text" id="description" name="description" value=${product.description}  autocomplete="off">
            </div>
            <div class="form-group">
                <label for="quantity">Quantity</label>
                <input class="form-control" id="quantity" name="quantity" value=${product.quantity} required>
            </div>
            <div class="form-group">
                <label for="price">Price</label>
                <input type="text" id="price" name="price" value=${product.price}>               
            </div>           
            <button type="submit" class="btn btn-primary" value="submit">Save</button>
            <a href="/DeleteItem?id=${product.id}" class="btn btn-secondary" onclick="return confirm('Are you sure?')">Delete Item</a>
            
</form>
<a href="/" class="btn btn-secondary">Home</a>
</body>
</html>