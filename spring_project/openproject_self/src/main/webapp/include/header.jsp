<%@page import="com.aia.self.domain.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/css/default.css" var="url_defaultCss" scope="application" />


<!-- 로그인페이지 -->
<c:url value="/member/login" var="login"/>





<header>
	<h1>
		<font color="rebeccapurple">H</font>YOSEON<font color="rebeccapurple">L</font>OG
	</h1>
<%
	String userName = (String) request.getAttribute("userName");

	if (userName==null)
		
	{
%>

<a href="${login}">로그인</a>

<%
	}else{
	%>
	<img class="userphoto" src="../uploadphoto/${profileFile}" height=50" width=50">
	<a>${userName}님 안녕하세요</a>
	
			<br>
       <a href="">로그아웃</a>
       <a href="">마이페이지&nbsp;&nbsp;</a>

<%}
%>

    </header>
    
