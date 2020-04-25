<%@ page pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<body>

<div style"width: 700px ; height: 600px; margin-left:89px;">

<h2>Enter Trainee details</h2>
 <form  action="add" method="post" modelAttribute="trainee">
<table>
<tr>
<td>Trainee Id:-</td>
<td><input type="text" placeholder="enter id" name="traineeid"/></td>
</tr>
<tr>
<td>Trainee Name:-</td>
<td><input type="text" placeholder="enter name" name="traineename"/></td>
</tr>
<tr><td>Trainee Location:-</td>
	<td><input type="radio" value="Banglore" name="traineelocation"/>Bangalore
	<input type="radio" value="Pune" name="traineelocation"/>Pune
	<input type="radio" value="Mumbai" name="traineelocation"/>Mumbai
	</td></tr>
<tr><td>Trainee Domain:-</td>
<td><select name="traineedomain">
	<option value="Java">Java</option>
	<option value=".Net">.Net</option>
	<option value="Android">Android</option>
</select></td></tr>
<tr><td><input type="submit" value="Add Trainee"/></td>
<td><input type="Reset" value="Reset"/></td></tr></table></form>
</div>
<h3>${msg }</h3>
</body>
</html>