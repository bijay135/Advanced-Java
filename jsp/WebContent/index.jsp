<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%!int a = 5;%>

	<%
		a++;
	%>

	<%=a%>

	<%!String[] names = { "Aviskar", "Aashish", "Sabin", "Bijay" };%>

	<%
		for (String name : names) {
	%>
	<p>
		<%=name%>
	</p>
	<%
		}
	%>

</body>
</html>