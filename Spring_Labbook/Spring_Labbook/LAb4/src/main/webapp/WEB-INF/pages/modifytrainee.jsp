<%@ page pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2>Modify Trainee</h2>

<form action="modify" method="post"><table>
<tr><td>Please enter trainee Id:-</td>
<td><input type="text" name="modifyId"/></td>
<td><input type="submit" value="Find"/></td></tr></table></form><br><br>
<form action="modifytrainee"  method="post" modelAttribute="trainee">
<table>
<tr><th>Trainee Id</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
<th>Action</th>
</tr>

<tr>
<td><input type="text" value="${list.traineeid}" name="traineeid" /></td>
<td><input type="text" value="${list.traineename}" name="traineename" /></td>
<td><input type="text" value="${list.traineelocation}" name="traineelocation"/></td>
<td><input type="text" value="${list.traineedomain}" name="traineedomain"/></td>
<td><input type="submit" Value="Modify"/></td></tr>
</table></form>
<h3>${msg }</h3>
</body>
</html>