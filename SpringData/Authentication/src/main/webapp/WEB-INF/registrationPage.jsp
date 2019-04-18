<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<div class="container">
		<h1>Register</h1>
		<form:form action="/registration" method="post" modelAttribute="user">
			 <div class="form-group">
		        <form:label path="email">Email</form:label>
		        <form:errors path="email"/>
		        <form:input class="form-control" path="email"/>
		    </div>
		    <div class="form-group">
		        <form:label path="password">Password</form:label>
		        <form:errors path="password"/>
		        <form:password class="form-control" path="password"/>
		    </div>
		    <div class="form-group">
		        <form:label path="passwordConfirmation">Confirm Password</form:label>
		        <form:errors path="passwordConfirmation"/>
		        <form:password class="form-control" path="passwordConfirmation"/>
		    </div>
		    <button>Register</button>
		</form:form>
	</div>
</body>
</html>