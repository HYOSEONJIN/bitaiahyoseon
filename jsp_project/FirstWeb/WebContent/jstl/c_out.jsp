<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 코어태그사용을 위한 태그라이브러리 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- 모듈화가능 -->
<%@ include file="makeList.jsp"%>

<%
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>회원리스트</h1>

	<table border="1">
		<tr>
			<th>INDEX</th>
			<th>COUNT</th>
			<th>ID</th>
			<th>PASS</th>
			<th>NAME</th>
			<th>PHOTO</th>
		</tr>
		<!-- index, count -->
		<c:forEach items="${members}" var="member" varStatus="status">
			<tr>
				<td>${status.index}</td>
				<td>${status.count}</td>
				<td>${member.userId}</td>
				<td>${member.pass}</td>
				<td>${member.userName}</td>
				
				<td>
					<c:out value="${member.userPhoto}" escapeXml="false">
						<span style="color:red">프로필 사진 없음</span>
					</c:out>				
				</td>
				
			</tr>
			<!-- index, count -->

		</c:forEach>
	</table>
	
	<c:forEach var="num" begin="1" end="10" step="2">
		${num} <br>
	
	</c:forEach>

</body>
</html>
