<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/default.css">

<title>HYOSEONLOG</title>

<script>



</script>
</head>

<body>

	<!-- 로그인페이지 -->
	<c:url value="/member/login" var="login" />
	<!-- 회원가입페이지 -->
	<c:url value="/member/reg" var="reg" />


	<%@ include file="/include/header.jsp"%>
	<%@ include file="/include/nav.jsp"%>



	<div class="contents">
		<div class="memberlogin">
			<h1>LOGIN</h1>
			<form action="${login}" method="post">
				<table class="logintable">
					<tr>
						<td>아이디</td>
						<td><input type="text" id="userid" name="userid"></td>
					</tr>

					<tr>
						<td>패스워드</td>
						<td><input type="password" id="userpw" name="userpw"></td>
					</tr>
						  			
      	  			<tr>
      	  			<td colspan="2"><input type="checkbox" name="chk" value="on"
							${cookie.uid ne null? 'chekce':'' }>아이디저장</td>   
      	  			</tr> 

					<tr>
						<td colspan="2"><input type="submit" value="LOGIN"></td>
					</tr>
				</table>
			</form>
			
			<table class="logintable">
				<tr>
					<td><a href="${reg}">회원가입</a></td>
					<td><a>아이디/비밀번호 찾기</a>
				</tr>
			
			</table>

		</div>
	</div>

	<%@ include file="/include/footer.jsp"%>


</body>

</html>
