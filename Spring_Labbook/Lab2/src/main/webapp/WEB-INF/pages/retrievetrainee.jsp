<%@ page pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<body>
<h2>Retrieve Trainee</h2>
<form action="retrieve" method="post">
<table>
<tr><td>Please enter trainee Id:-</td>
<td><input type="text" name="retrieveId"/></td>
<td><input type="submit" value="Retrieve"/></td></tr>
</table>
</form>
<br><br>
<table border="3">
<tr><th>Trainee Id</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th>
</tr>

<tr>
<td>${list.traineeid}</td>
<td>${list.traineename}</td>
<td>${list.traineelocation}</td>
<td>${list.traineedomain}</td></tr>
</table>

</body>
</html>