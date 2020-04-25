<%@ page pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<body>
<h2>Delete Operation</h2>
<form action="delete" method="post"><table>
<tr><td>Please enter trainee Id:-</td>
<td><input type="text" name="deleteId"/></td>
<td><input type="submit" value="Find"/></td></tr></table></form><br><br>

<form action="deletetrainee/${list.traineeid}"  method="post" modelAttribute="trainee">
<table>
<tr><th>Trainee Id</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
<th>Action</th>
</tr>

<tr>
<td><input type="text" value="${list.traineeid}"  readonly/></td>
<td><input type="text" value="${list.traineename}"  readonly/></td>
<td><input type="text" value="${list.traineelocation}"  readonly/></td>
<td><input type="text" value="${list.traineedomain}"  readonly/></td>
<td><input type="submit" Value="Delete"/></td></tr>
</table></form>
 <h3>${msg }</h3>
 
</body>
</html>