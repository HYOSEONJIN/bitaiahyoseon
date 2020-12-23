<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<nav>
	<ul>
		
		<li><a href="<c:url value="/"/>">HOME</a></li>

		<%
			if (session.getAttribute("loginInfo") == null) {
		%>
		<li><a
			href="<c:url value="/member/memberRegForm.jsp"/>">회원가입</a></li>
		<li><a href="<c:url value="/member/loginForm.jsp"/>">로그인</a></li>

		<%
			} else {
		%>

		<li><a href="<c:url value="/member/logout.jsp"/>">로그아웃</a></li>

		<%
			}
		%>


		<li><a
			href="<c:url value="/member/mypage/mypage1.jsp"/>">마이페이지1</a></li>
		<li><a
			href="<c:url value="/member/mypage/mypage2.jsp"/>">마이페이지2</a></li>
		<li><a href="#">HOME</a></li>
	</ul>
</nav>
