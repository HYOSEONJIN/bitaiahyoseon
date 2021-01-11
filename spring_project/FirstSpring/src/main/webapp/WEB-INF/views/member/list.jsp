<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member List</title>
</head>
<body>

	<h1>회원리스트</h1>

	<hr>
	${members}
	
	<h3>총회원수 ${memberCnt}</h3>

	<table>
		<tr>
			<th>idx</th>
			<th>id</th>
			<th>password</th>
			<th>name</th>
			<th>사진</th>
			<th>가입일</th>
		</tr>
		
		<c:forEach items="${members}" var="member"> 
			<tr>
				<td>${member.idx}</td>
				<td>${member.memberid}</td>
				<td>${member.password}</td>
				<td>${member.membername}</td>
				<td>${member.memberphoto}</td>
				<td>${member.toDate}</td>
			</tr>
		</c:forEach>
		
	</table>

</body>
</html>