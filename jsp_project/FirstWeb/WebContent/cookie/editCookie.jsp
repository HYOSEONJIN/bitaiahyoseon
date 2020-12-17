<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	// V를 BTS로 변경
	Cookie cookie = new Cookie("userID", "BTS");
	response.addCookie(cookie);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>쿠키 userID의 값이 변경되었습니다.</h1>
<a href="viewCookie.jsp">바뀐 쿠키 정보 확인 </a>

</body>
</html>