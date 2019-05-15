<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
			
	<table border = "1">
		<tr>
			<th> Motherboard </th>
			<th> CPU </th>
			<th> GPU </th>
			<th> RAM </th>
			<th> SSD </th>
		</tr>
		<c:forEach items = "${parts}" var = "part">
			<tr>
				<td> ${part.motherboard} </td>
				<td> ${part.cpu}  </td>
				<td> ${part.gpu}  </td>
				<td> ${part.ram}  </td>
				<td> ${part.ssd}  </td>
			</tr>
		</c:forEach>	
		</table>
</body>
</html>