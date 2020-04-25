<%@ page pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Product</title>
</head>
<body>
<div style="width:700px;height: 600px; margin-left:89px;">

<form action="addProduct" method="post" modelAttribute="product">
<input type="text" name="id" placeholder="Product Id"/>
<input type="text" name="name" placeholder="Product Name"/>
<input type="text" name ="price" placeholder="Product Price"/>
<br><br>
<input type= "submit" name="s" value="AddProduct"/>
</form>
<p style="color:blue; background-color: yellow;">${mssg }</p>
</body>
</html>