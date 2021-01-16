
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/views/include/basicset.jsp" %>


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
		<h2 class="content_title">my page</h2>
		<hr>
		<div class="content">
		마이페이지입니닷. <br>
		${loginInfo}
		</div>
		<img alt="회원사진" src="<c:url value="/fileupload/member/${loginInfo.memberphoto}"/>"> 
	</div>
		<%@ include file="/WEB-INF/views/include/footer.jsp"%>


</body>
</html>