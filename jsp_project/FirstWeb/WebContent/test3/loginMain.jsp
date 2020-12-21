<%@page import="util.CookieBox"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	CookieBox cookieBox = new CookieBox(request);

	String saveId =  cookieBox.exists("saveId")? cookieBox.getValue("saveId"):"";	
	String checked = cookieBox.exists("saveId")? "checked " :  "";
	
	%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인폼 만들기 혼자해보기</title>
</head>
<body>


<form action="loginResult.jsp" method="get">

아이디 <input type="text" id="userid" name="userid" value="<%= saveId%>"><br>
비밀번호 <input type="password" id="pw" name="pw"><br>
<input type="checkbox" name="idsavechk" value="save" <%= checked%>> 아이디 저장
<input type="submit" value="로그인하기">


</form>


</body>
</html>