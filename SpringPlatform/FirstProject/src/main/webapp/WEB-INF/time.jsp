<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page - Time</title>
<link rel="stylesheet" href="css/main.css" />
</head>
<body onload='alertPage("time")'>
	<h1 id='time'><c:out value='${ time }' /></h1>
	<script type="text/javascript" src="js/main.js" defer></script>	
</body>
</html>