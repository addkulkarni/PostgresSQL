<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<pre>
		<form action="update" method="post">
		
		<input type="hidden" name="id" value="${s.id}">
			Name: <input type="text" name="name" value="${s.name}">
			
			Username: <input type="text" name="username" value="${s.username}">
			
			Password: <input type="password" name="password" value="${s.password}">
			
			<input type="submit" value="UPDATE">
		</form>
	</pre>
</body>
</html>