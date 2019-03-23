<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Pets Dot Com</title>
</head>
<body>
	<h1>Welcome to PETS</h1>
	<hr>
	<h2>Add a Cat</h2>
	<form action="/Pets/cats" method="POST">
		<input type="text" placeholder="Name:" name="name">
		<input type="text" placeholder="Breed:" name="breed">
		<input type="number" placeholder="Weight:" name="weight">
		<button>Add Cat</button>
	</form>
	<h2>Add a Dog</h2>
	<form action="/Pets/dogs">
		<input type="text" placeholder="Name:" name="name">
		<input type="text" placeholder="Breed:" name="breed">
		<input type="number" placeholder="Weight:" name="weight">
		<button>Add Dog</button>
	</form>
</body>
</html>