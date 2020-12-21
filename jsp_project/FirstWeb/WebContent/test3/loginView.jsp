<%@page import="form.LoginFormData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%

	LoginFormData loginData = (LoginFormData) session.getAttribute("loginData");
	boolean loginCheck = loginData == null ? false : true;
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%  %>
<h1>로그인 성공!</h1>
id :  <%= loginData.getUserId() %>
pw :  <%= loginData.getPass() %>
<br><br>
<%
if(loginCheck){
	out.println("<h3><a href=\"logout.jsp\">로그아웃</a><h3>");
}else{
	%>
	
	<script>
		alert('로그인이 필요한 페이지입니다.');
		location.href='loginMain.jsp';
	</script>
	
	
	
	<%
}
	
	 %>
</body>
</html>