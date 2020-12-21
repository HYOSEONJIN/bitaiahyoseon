<%@page import="form.LoginFormData"%>
<%@page import="util.CookieBox"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%

String userId = request.getParameter("userid");
String pass = request.getParameter("pw");
String chk = request.getParameter("idsavechk");


// 체크를 했으면 쿠키에 저장
if(chk!=null && chk.equals("save") && userId!=null && !userId.isEmpty()){
	
	response.addCookie(CookieBox.createCookie("saveId", userId,"/", 60*60*24));
} else{
// 체크안했으면 삭제~
	response.addCookie(CookieBox.createCookie("saveId", userId,"/", 0));
}

// id와 password가 같을 경우메 로그인 처리하는 방식

boolean loginChk = false;

// 같을 때
if (userId.equals(pass)){
	
	LoginFormData data = new LoginFormData();
	
	data.setUserId(userId);
	data.setPass(pass);
	
	request.setAttribute("loginData", data);
	session.setAttribute("loginData", data);
	
	loginChk = true;
} else{
	// 틀릴 때는 실패
}

// 로그인 이후 포워딩

if(loginChk){
%>
<jsp:forward page="loginView.jsp"/>
<%
} else{
%>
<script>
	alert("아이디와 비밀번호가 일치하지 않습니다.")
	/* 이전 페이지로 보내버리기~! */
	history.go(-1); 
</script>
<%
}
%>