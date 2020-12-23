<%@page import="util.CookieBox"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/default.css">
	
	<%
	CookieBox cookieBox = new CookieBox(request);

	// 삼항연산자 [null값 출력을 막기 위해]
	String saveId =  cookieBox.exists("uid")? cookieBox.getValue("uid"):"";	
	String checked = cookieBox.exists("uid")? " checked " :  "";
	
%>

<style>
</style>
</head>
<body>


	<%@ include file="/include/header.jsp"%>

	<%@ include file="/include/nav.jsp"%>


	<div class="contents">
		<h2 class="content_title">로그인 Form</h2>
		<hr>	
		<div class="content">
			<form action="<c:url value="/member/login.jsp"/>" method="get">
				<table>
					<tr>
						<th><label for="userid">아이디</label></th>
						<td><input type="text" id="userid" name="userid"
							value="<%=saveId%>"></td>
					</tr>
					<tr>
						<th><label for="pw">비밀번호</label></th>
						<td><input type="password" id="pw" name="pw"></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="checkbox" name="chk" value="on"
							<%=checked%>> 아이디 저장</td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="로그인"></td>
					</tr>
				</table>
			</form>

		</div>
	</div>

	<%@ include file="/include/footer.jsp"%>

</body>
</html>