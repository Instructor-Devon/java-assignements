<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.pets.models.Animal,com.pets.models.Cat"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%
		Animal animal = (Animal)request.getAttribute("animal");
		String type = (animal instanceof Cat) ? "Cat" : "Dog";
	%>
	
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>New <%= type %></title>
</head>
<body>
	<h2>You created a <%= animal.getBreed() %></h2>
	<p>Gresdfeting: <c:out value="${ animal.sayGreeting() }" /></p>
</body>
</html>