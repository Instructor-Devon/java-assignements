<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello World</title>
</head>
<body>
<%!
	String name = "Devon";
%>
<% String req = request.getParameter("name"); %>
	<h1>Sup <%= name %>, I SEE YOU TOO <%= req %></h1>
</body>
</html>