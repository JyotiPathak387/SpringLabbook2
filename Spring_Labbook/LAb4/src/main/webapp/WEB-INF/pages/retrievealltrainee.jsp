<%@ page pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Retrieve all trainee</h2>
<table border="3">
<tr><th>Trainee Id</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
</tr>
<c:forEach items="${list}" var="item">
<tr>
<td>${item.traineeid}</td>
<td>${item.traineename}</td>
<td>${item.traineelocation}</td>
<td>${item.traineedomain}</td></tr></c:forEach>
</table>


</body>
</html>