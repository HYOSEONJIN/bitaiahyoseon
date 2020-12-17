<%@page import="util.CookieBox"%>
<%@page import="form.LoginFormData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%

LoginFormData lfData = new LoginFormData();

String userId = request.getParameter("userid");
String pass = request.getParameter("pw");

String chk = request.getParameter("chk");

if(chk!=null && chk.equals("on") && userId!=null && !userId.isEmpty()){
	// 쿠키 생성 저장해준다
	// uid =  userId를 저장하자
	response.addCookie(CookieBox.createCookie("uid", userId, "/", 60*60*24*365));
	
}else{
	// 저장하지 않기 & 저장이 되었다면 삭제하기
	response.addCookie(CookieBox.createCookie("uid", userId, "/", 0));
}

lfData.setUserId(userId);
lfData.setPass(pass);

request.setAttribute("loginData", lfData);
%>

<jsp:forward page="loginView.jsp"/>