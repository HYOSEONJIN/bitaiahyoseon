<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url value="/css/default.css" var="url_defaultCss" scope="application"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%-- <link rel="stylesheet" 	href="<%=request.getContextPath()%>/css/default.css"> --%>
<%-- <link rel="stylesheet" href="${pageContext.request.contextPath}/css/default.css"> --%>
<link rel="stylesheet" href="${url_defaultCss}">


<style>
</style>
</head>
<body>

	

	<%@ include file="/include/header.jsp" %>
	
	<%@ include file="/include/nav.jsp" %>


	<div class="contents">
		<h2 class="content_title">index</h2>
		<hr>
		<div class="content">인덱스페이지입니다</div>
	</div>

	<%@ include file="/include/footer.jsp" %>

</body>
</html>