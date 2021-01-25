<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%-- <link rel="styleSheet"
	href="${pageContext.request.contextPath}/css/default.css"> --%>
	<%-- <link rel="styleSheet" href="<c:url value="/css/default.css"/>"> --%>
<%@ include file="/WEB-INF/views/include/basicset.jsp" %>
<style>
</style>
</head>
<body class="bg-light">



	<%@ include file="/WEB-INF/views/include/header.jsp"%>

	<%@ include file="/WEB-INF/views/include/nav.jsp"%>

<main class="container">

  <div class="d-flex align-items-center p-3 my-3 text-white bg-purple rounded shadow-sm">
    <img class="me-3" src="../assets/brand/bootstrap-logo-white.svg" alt="" width="48" height="38">
    <div class="lh-1">
      <h1 class="h6 mb-0 text-white lh-1">INDEX</h1>
      <small>졸려</small>
    </div>
  </div>
<!-- 	<div class="contents">
		<h2 class="content_title">index</h2>
		<hr>
		<div class="content">인텍스 페이지 입니다.</div>
	</div> -->

</main>


	<%@ include file="/WEB-INF/views/include/footer.jsp"%>











</body>
</html>