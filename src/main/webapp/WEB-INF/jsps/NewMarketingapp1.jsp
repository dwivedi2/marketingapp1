<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create new table</title>
</head>
<body>
	<h2>New Marketing Table</h2>
	<form action="saveMark" method="post">
	 <pre>
	   Name<input type="text" name="name"/>
	   Age<input type="number" name="age"/>
	   salary<input type="text" name="salary" />
	   Experience<input type="number" name="experiance"/>
	   RollNumber<input type="number" name="rollNumber"/>
	   <input type="submit" value="save"/>
	</pre>
	</form>
</body>
</html>