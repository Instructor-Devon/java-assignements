<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students App</title>
</head>
<body>
	<div class="container">
		<h2>All Students</h2>
		<h3><a href="/contacts/new">Create Contact</a> | <a href="/new">Create Student</a></h3>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Name</th>
					<th>Age</th>
					<th>Address</th>
					<th>City</th>
					<th>State</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${ students }" var="student">
				<tr>
					<td>${ student.firstName } ${ student.lastName }</td>
					<td>${ student.dob }</td>
					<td>${ student.contact.address }</td>
					<td>${ student.contact.city }</td>
					<td>${ student.contact.state }</td>		
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>