
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/views/include/basicset.jsp" %>

<c:if test="${result eq 1}">
<script>
	alert("삭제 완료");
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
		<h2 class="content_title">회원정보 삭제 실패</h2>
		<hr>
		<div class="content">
			<h1>요청하신 인덱스 회원정보 없음.<br> 다시 확인후 시도 바람.</h1> 
	</div>
		<%@ include file="/WEB-INF/views/include/footer.jsp"%>


</body>
</html>
</c:if>