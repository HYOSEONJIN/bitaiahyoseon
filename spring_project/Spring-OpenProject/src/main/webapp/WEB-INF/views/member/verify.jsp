<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="/WEB-INF/views/include/basicset.jsp" %>
<style>

	img {
		width:100px;
		border-radius: 50%;
	}


</style>
</head>
<body >


	<%@ include file="/WEB-INF/views/include/header.jsp"  %>
		
	<%@ include file="/WEB-INF/views/include/nav.jsp"  %>
	
	<div class="contents">
		<h2 class="content_title">Email 인증</h2>
		
		<c:if test="${result==0}">
		<h1>인증 실패</h1>
		</c:if> 
		
		<c:if test="${result==1}">
		<h1>인증 성공</h1>
		</c:if> 
		
		<c:if test="${result==3}">
		<h1>이미 인증되었습니다.</h1>
		</c:if> 
		<hr>
		<div class="content">
		 
		</div>
	</div>
	
	<%@ include file="/WEB-INF/views/include/footer.jsp" %>

</body>
</html>