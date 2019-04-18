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
<title>Login Page</title>
</head>
<body>
	<div class="container">
		<h1>Login</h1>
		<p>${ error }</p>
		<form action="/login" method="post">
			 <div class="form-group">
		        <label for="email">Email</label>
		        <input class="form-control" name="email" id="email"/>
		    </div>
		    <div class="form-group">
		        <label for="password">Password</label>
            	<input class="form-control" type="password" id="password" name="password"/>
		    </div>
		    <button>Login</button>
		</form>
	</div>
</body>
</html>