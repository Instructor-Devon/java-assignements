<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<link rel="stylesheet" href="/css/main.css" />
<title>Books App</title>
</head>
<body>
	<div class="container">
		<h1>Edit Book</h1>
		<form:form action="/books/${ book.id }" method="post" modelAttribute="book">
			<input type="hidden" name="_method" value="put">
		    <div class="form-group">
		        <form:label path="title">Title</form:label>
		        <form:errors path="title"/>
		        <form:input class="form-control" path="title"/>
		    </div>
		    <div class="form-group">
		        <form:label path="description">Description</form:label>
		        <form:errors path="description"/>
		        <form:textarea class="form-control" path="description"/>
		    </div>
			<div class="form-group">
		        <form:label path="language">Language</form:label>
		        <form:errors path="language"/>
		        <form:input class="form-control" path="language"/>
		    </div>
		    <div class="form-group">
		        <form:label path="numberOfPages">Pages</form:label>
		        <form:errors path="numberOfPages"/>     
		        <form:input class="form-control" type="number" path="numberOfPages"/>
		    </div>
		    <input type="submit" value="Submit"/>
		</form:form>
	</div>
</body>
</html>