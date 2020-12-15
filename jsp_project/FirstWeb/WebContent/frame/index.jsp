<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Frame Include</title>
<style>
div.header {
	text-align: center;
}

div.nav {
	text-align: center;
}

div.news, div.shopping {
	width: 45%;
}

div.news {
	float: left;
}

div.shopping {
	float: right;
}

div.footer {
	clear: both;
	text-align: center;
}
</style>

</head>
<body>

	<%@ include file="header.jsp"%>
	<%@ include file="nav.jsp"%>

	<div class="contents">
		<%@ include file="news.jsp"%>
		<%@ include file="shopping.jsp"%>

	</div>

	<%-- 	<jsp:include page="footer.jsp">
		<jsp:param name="email" value="test@test.net"/>
		<jsp:param name="tel" value="000-000-0000"/>
	</jsp:include> --%>

	<jsp:forward page="footer.jsp">
		<jsp:param name="email" value="test@test.net" />
		<jsp:param name="tel" value="000-000-0000" />
	</jsp:forward>


	<%--  <%@ include file="footer.jsp" %> --%>

</body>
</html>