<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:set var="msg" value="user1" />
	msg : ${msg}
	<!-- 기본으로 page 속성에 들어가있음 -->
	<br>

	<%-- <c:if test="논리값이 true일때 출력"></c:if> --%>
	<c:if test="${true}">
		1) test 속성값이 true일때 출력
	</c:if>
	<br>

	<c:if test="${msg=='user1'}">
		2) test 속성값이 true일때 출력
	</c:if>
	<br>

	<c:if test="${msg=='user1'}" var="result" scope="page">
		3) test 속성값이 true일때 출력 : ${result}
	</c:if>
	<br>

	<c:if test="${msg eq 'user1'}" var="result1" scope="page">
		4) test 속성값이 true일때 출력 : ${result1}
	</c:if>
	<br>
	
	<c:if test="${msg ne 'user1'}" var="result2" scope="page">
		5) test 속성값이 true일때 출력 : ${result2}
	</c:if>	${result2}
	
	<br>
	
	 
	
	<c:set var="number" value="12"/>
	
	<c:choose>
		<c:when test="${number>0}">
			양수입니다.
		</c:when>
		<c:when test="${number<0}">
			음수입니다.
		</c:when>
		<c:otherwise>
			0입니다.
		</c:otherwise>	
	</c:choose>
	
	<br>
	
	
	<input type="checkbox" ${msg=='user1'?'checked':''}>
	<br>
	id 저장 <input type="checkbox" ${cookie.uid ne null?'checked':''}>
	

</body>
</html>