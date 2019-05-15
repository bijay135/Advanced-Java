<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		for (String name : (List<String>) request.getAttribute("names")) {
	%>
	<h1><%=name%></h1>
	<%
		}
	%>

</body>
</html>