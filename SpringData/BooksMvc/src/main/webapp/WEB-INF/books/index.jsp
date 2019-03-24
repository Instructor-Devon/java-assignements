<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<title>Books App</title>
</head>
<body>
	<div class="container">
		<h1>Welcome to Books Dot Com!</h1>
		<a href="/books/new">Add a book...</a>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Title</th>
					<th>Description</th>
					<th>Language</th>
					<th>Number of Pages</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${ books }" var="book">
				<tr>
					<td><a href="books/<c:out value="${ book.id }" />"><c:out value="${ book.title }" /></a></td>
					<td><c:out value="${ book.description }" /></td>
					<td><c:out value="${ book.language }" /></td>
					<td><c:out value="${ book.numberOfPages }" /></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>