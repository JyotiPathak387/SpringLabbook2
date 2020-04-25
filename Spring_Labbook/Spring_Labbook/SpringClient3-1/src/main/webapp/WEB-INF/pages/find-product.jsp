<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Product</title>
</head>
<body>
<div style="width": 1000px; height: 900px margin-left: 90px;">

<form action="viewProduct" method="post" modelAttribute="productId">
<h1>Get Product</h1>
<input type="text" name="id" placeholder="Product Id"/>
<br>
<br>
<input type="submit" name="s" value="showProduct"/>
</form>
<p style= "color:blue; background-color:yellow;">${mssg }</p></div></body>
</html>