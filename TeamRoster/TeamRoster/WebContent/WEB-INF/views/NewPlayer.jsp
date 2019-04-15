<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>New Player</title>
</head>
<body>
	<form action="Players" method="post">
		<input type="hidden" name="id" value="${id}">
		<h1>Add a new player to ${team.getName()}</h1>
		First Name: <input type="text" name="firstName">
		Last Name: <input type="text" name="lastName">
		Age: <input type="number" name="age">
		<input type="submit" value="Create Player">
	</form>
	<h1>${id}</h1>
</body>
</html>