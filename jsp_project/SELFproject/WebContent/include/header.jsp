<%@page import="member.model.LoginMemberInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/css/default.css" var="url_defaultCss" scope="application" />

<header>
	<h1>
		<font color="rebeccapurple">H</font>YOSEON<font color="rebeccapurple">L</font>OG
	</h1>

	<%
		LoginMemberInfo loginInfo = (LoginMemberInfo) session.getAttribute("loginInfo");

	if (loginInfo == null) {
	%>

	<a href="<%=request.getContextPath()%>/memberlogin/LoginMain.jsp"
		class="login_a">로그인</a>


	<%
		} else

	// src="<c:url value="/upload/member/${member.userPhoto}"/>">
	{
	%>
	
	<img class="userphoto" src="<c:url value="/upload/memberprofile/${loginInfo.userPhoto}"/>" height=50" width=50">	
	
	<a>${loginInfo.userName}님, 안녕하세요</a>
		<br>
       <a href="<%=request.getContextPath()%>/memberlogin/logout.jsp">로그아웃</a>
       <a href="<%=request.getContextPath()%>/memberlogin/mypage.jsp">마이페이지&nbsp;&nbsp;</a>
        	
        <%}%>
    </header>