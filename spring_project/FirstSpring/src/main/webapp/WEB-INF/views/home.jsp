<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Index 
</h1>


	<ul> 
		<li>
		<c:url value="/hello" var="hello"/><a href="${hello}">/hello</a></li>
		<li>
		<c:url value="/member/login" var="login"/><a href="${login}">/login</a></li>
		</li>
	</ul>
</body>
</html>
