
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/views/include/basicset.jsp" %>

<c:if test="${result eq 1}">
<script>
	alert("수정 완료");
	location.href='<c:url value="/member/list"/>';	
</script>
</c:if>
<c:if test="${result ne 1}">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
</style>
</head>
<body >



	<%@ include file="/WEB-INF/views/include/header.jsp"%>

	<%@ include file="/WEB-INF/views/include/nav.jsp"%>

	
	<div class="contents">
		<h2 class="content_title">회원정보 수정 실패</h2>
		<hr>
		<div class="content">
			<h1>실패쓰^^..</h1> 
	</div>
		<%@ include file="/WEB-INF/views/include/footer.jsp"%>


</body>
</html>
</c:if>