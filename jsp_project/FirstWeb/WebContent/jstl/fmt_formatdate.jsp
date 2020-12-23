<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%
	request.setAttribute("now", new Date());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


 
<%-- 전부 홍콩 시간대로 바귐 <fmt:timeZone value="Hongkong"> --%>
	<b>date</b><br>
	${now}<br>
	<fmt:formatDate value="${now}"/><br>
	<fmt:formatDate value="${now}" type="date"/><br>
	<fmt:formatDate value="${now}" type="date" dateStyle="full"/><br>
	<fmt:formatDate value="${now}" type="date" dateStyle="short"/><br>
	<b>time</b><br>
	<fmt:formatDate value="${now}" type="time"/><br>
	<fmt:formatDate value="${now}" type="time" timeStyle="full"/><br>
	<fmt:formatDate value="${now}" type="time" timeStyle="short"/><br>
	<b>both</b><br>
	<fmt:formatDate value="${now}" type="both"/><br>
	<fmt:formatDate value="${now}" type="both" dateStyle="full" /><br>
	<fmt:formatDate value="${now}" type="both" dateStyle="short" timeStyle="short"/><br>
	<b>패턴</b> <br>
	<fmt:formatDate value="${now}" pattern="z a h:mm"/><br>
	<fmt:formatDate value="${now}" pattern="hh:mm"/><br>
	<fmt:formatDate value="${now}" pattern="yyy-MM-dd h:mm"/><br>
	<fmt:formatDate value="${now}" pattern="yyy-MM-dd h:mm" timeZone="Hongkong"/><br>
	
<%-- </fmt:timeZone> --%>
	
</body>
</html>