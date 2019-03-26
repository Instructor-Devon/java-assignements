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
		<h2>New Contact</h2>
		<form:form action="/contacts" method="POST" modelAttribute="contact">
			<div class="form-group">
		        <form:label path="student">Student</form:label>
		        <form:errors path="student"/>
		        <form:select class="form-control" path="student">
		        <c:forEach items="${ students }" var="stud">
		        	<form:option value="${ stud.id }">${ stud.firstName } ${ stud.lastName }</form:option>
		        </c:forEach>
		        </form:select>
		    </div>
		    <div class="form-group">
		        <form:label path="address">Address</form:label>
		        <form:errors path="address"/>
		        <form:input class="form-control" path="address"/>
		    </div>
		    <div class="form-group">
		        <form:label path="city">City</form:label>
		        <form:errors path="city"/>
		        <form:input class="form-control" path="city"/>
		    </div>
		    <div class="form-group">
		        <form:label path="state">State</form:label>
		        <form:errors path="state"/>
		        <form:input class="form-control" path="state"/>
		    </div>
		    <button>Add Contact</button>
	    </form:form>
	</div>
</body>
</html>