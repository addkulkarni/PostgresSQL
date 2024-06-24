<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<pre>
		<table border=2>
			<tr>
				<th>NAME</th>
				<th>USERNAME</th>
				<th>PASSWORD</th>
				<th>ACTION</th>
			</tr>
			<c:forEach items="${data}" var="l">
				<tr>
					<td>${l.name}</td>
					<td>${l.username}</td>
					<td>${l.password}</td>
					<td><a href="edit?id=${l.id}">EDIT</a> || <a href="delete?id=${l.id}">DELETE</a></td>
				</tr>
			</c:forEach>
			
		</table>
	</pre>
</body>
</html>