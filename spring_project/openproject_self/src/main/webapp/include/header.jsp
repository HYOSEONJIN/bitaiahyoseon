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

<c:if test="${not loginCheck}">
<a href="${login}">로그인</a>
</c:if>


<c:if test="${loginCheck}">
	<img class="userphoto" src="<c:url value="/uploadphoto/${loginInfo.userphoto}"/>" height="50" width="50">
	<a>${loginInfo.username}님 안녕하세요</a>
	
			<br>
       <a href="/member/logout">로그아웃</a>
       <a href="">마이페이지&nbsp;&nbsp;</a>

</c:if>

    </header>
    
