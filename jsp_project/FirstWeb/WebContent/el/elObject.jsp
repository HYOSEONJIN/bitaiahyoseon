<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% 

	request.setAttribute("userName", "김태형1");
	session.setAttribute("userName", "김태형2");
	application.setAttribute("userName", "김태형3");
	session.setAttribute("userId", "V");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>
<!-- 
내장객체의 표현식이 생략되었을 때 규칙.
1. pageScope영역에서 찾는다.
2. request  > 3. session > 4. application
[영역이작은쪽부터]
-->

	requestScope.userName : ${requestScope.userName},
							${userName}, <!-- 영역 생략가능 -->
							<%= request.getAttribute("userName") %> <br>
	sessionScope.userId : ${sessionScope.userId}, ${userId}
							<%= session.getAttribute("userId") %> <br>
							
	param.code : <%=request.getParameter("code") %>, 
				${param.code}<br>

	pageContext : <%= pageContext.getRequest().getServletContext().getContextPath() %><br>
				${pageContext.request.requestURI}<br>
				${pageContext.request.requestURL}<br>
				${pageContext.request.contextPath}<br>
				
</h1>

<a href="view1.jsp">session페이지 확인</a>

</body>
</html>