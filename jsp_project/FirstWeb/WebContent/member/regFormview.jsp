<%@page import="form.regFormData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	 regFormData rData = (regFormData) request.getAttribute("regData"); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>regform data 출력</h1>
	<hr>

	<table>
		<tr>
			<td>아이디</td>
			<td>${regData.userId}</td>
			<%-- <td><%= rData.getUserId()%></td> --%>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td>${regData.pass}</td>
			<%-- <td><%= rData.getPass()%></td> --%>
		</tr>
		<tr>
			<td>이름</td>
			<td>${regData.userName}</td>
			<%-- <td><%= rData.getUserName()%></td> --%>
		</tr>
<%-- 		<tr>
			<td>파일</td>
			<td>${regData.File}</td>
			<td><%= rData.getFile()%></td>
		</tr> --%>

	</table>
</body>
</html>
​