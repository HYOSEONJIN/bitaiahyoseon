<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>오류가 발생했습니다. 메인페이지로 이동해주세요</h1>
<h3>
	에러타입 : <%= exception.getClass().getName() %> <br>
	에러메세지 : <%= exception.getMessage() %>
	
</h3>
<a href="../index.jsp"> INDEX로 이동</a>

</body>
</html>