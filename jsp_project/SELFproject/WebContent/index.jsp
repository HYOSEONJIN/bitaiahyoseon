<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/css/default.css" var="url_defaultCss" scope="application"/>


<!DOCTYPE html>
<html lang="">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${url_defaultCss}">
    <title>HYOSEONLOG</title>
</head>

<body>

<%@ include file="/include/header.jsp" %>
<%@ include file="/include/nav.jsp" %>
    

    
    <div class="contents">
        <div class="content">
            <h1>CONTENT BODY</h1>
        </div>        
    </div>
    
<%@ include file="/include/footer.jsp" %>    
    

</body>

</html>
