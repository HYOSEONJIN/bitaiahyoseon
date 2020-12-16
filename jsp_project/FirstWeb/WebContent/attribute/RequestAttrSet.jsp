<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setAttribute("lang", "ko");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%-- <% <jsp:forward page="forward.jsp"/> %> --%>
	<!-- ko가 나온다  리퀘스트공유 > 포워드 or 인클루드 -->
	
	<%
		response.sendRedirect("forward.jsp");
		/* null이나온다 */
	%>
	
</body>
</html>