<%@page import="form.LoginFormData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%

LoginFormData lfData = new LoginFormData();

String userId = request.getParameter("userid");
String pass = request.getParameter("pw");

lfData.setUserId(userId);
lfData.setPass(pass);

request.setAttribute("loginData", lfData);
%>

<jsp:forward page="loginView.jsp"/>