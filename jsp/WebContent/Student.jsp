<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:forEach items="${names}" var="name">
		<h1>${name}</h1>
	</c:forEach>

	<c:if test="${not empty address}">
		<p>My address ${address}.</p>
	</c:if>

	<p>
		<f:formatDate value="${date}" pattern="MMM dd, yyyy" />
	</p>

	<p>
		<f:formatNumber value="${num}" maxFractionDigits="3" />
	</p>

</body>
</html>