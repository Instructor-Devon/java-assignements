<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.codingdojo.models.Person"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Show Person Page</title>
</head>
<body>
	<h1>Say Hello to our People</h1>
	<hr>
	<c:forEach var="person" items="${ people }">
	<p>
		<c:out value="${person.greeting() }" />
	</p>
	</c:forEach>
	
</body>
</html>