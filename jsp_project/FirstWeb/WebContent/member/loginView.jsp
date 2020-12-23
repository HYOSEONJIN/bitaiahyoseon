<%@page import="form.LoginFormData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	
    /* LoginFormData loginData =  (LoginFormData) request.getAttribute("loginData"); */
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>로그인 되었습니다.</h1>
<hr>
<table>
	<tr>
	<td>아이디</td>
	<%-- <td><%= loginData.getUserId() %></td> --%>
	<td>${loginData.userId}</td>
	</tr>
	<tr>
	<td>패스워드</td>
<%-- 	<td><%= loginData.getPass() %></td> --%>
	<td>${loginData.pass}</td>
	</tr>
</table>
	<h3><a href="loginSessionCheck.jsp">로그인 여부 체크 페이지</a></h3>

</body>
</html>