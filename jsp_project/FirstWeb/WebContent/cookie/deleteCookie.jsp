<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%
	// 쿠키 삭제를 위해 쿠키의 유지 시간을 0으로 설정해준다.
	Cookie cookie = new Cookie("userID","");
	cookie.setMaxAge(0);
	response.addCookie(cookie);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>쿠키 userID의 값이 삭제되었습니다.</h1>
<a href="viewCookie.jsp">삭제된 쿠키 정보 확인 </a>

</body>
</html>