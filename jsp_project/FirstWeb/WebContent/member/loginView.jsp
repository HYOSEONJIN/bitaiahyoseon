<%@page import="form.LoginFormData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	
    LoginFormData loginData =  (LoginFormData) request.getAttribute("loginData");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>아이디 패스워드 출력하기</h1>
<hr>
<table>
	<tr>
	<td>아이디</td>
	<td><%= loginData.getUserId() %></td>
	</tr>
	<tr>
	<td>패스워드</td>
	<td><%= loginData.getPass() %></td>
	</tr>
</table>

</body>
</html>