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
<a href="${login}">로그인</a>
    </header>