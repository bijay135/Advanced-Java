<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Actors Details</title>
</head>
<body>
			
	<table border = "1">
		<tr>
			<th> Name </th>
			<th> Genre </th>
			<th> Movie 1 </th>
			<th> Movie 2 </th>
			<th> Movie 3 </th>
		</tr>
		<c:forEach items = "${actors}" var = "actor">
			<tr>
				<td> ${actor.name} </td>
				<td> ${actor.genre}  </td>
				<td> ${actor.m1}  </td>
				<td> ${actor.m2}  </td>
				<td> ${actor.m3}  </td>
			</tr>
		</c:forEach>	
		</table>
</body>
</html>