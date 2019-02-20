<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products List</title>
</head>
<body>
<div class="container">
        <h1>Products</h1>
        <table class="table">
            <thead>
                <tr>
                    <th>Product</th><th>Description</th><th>Quantity</th><th>Price</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="products" items="${product}">
                <tr>
                    <td><a href="/productList/${product.id}">${product.name}</a></td>
                    <td>${product.description}</td>
                    <td>${classroom.quantity}</td>
                    <td>${product.price}</td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
      <!--    <a href="/productList/add" class="btn btn-secondary">Add Room</a> -->
    </div>

</body>
</html>