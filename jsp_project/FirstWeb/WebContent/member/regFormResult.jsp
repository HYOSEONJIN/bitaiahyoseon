<%@page import="form.regFormData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%


request.setCharacterEncoding("UTF-8");

regFormData rData = new regFormData();

String userId = request.getParameter("userid");
String pass = request.getParameter("pw");
String userName = request.getParameter("username");
Object fileName = request.getParameter("userPhoto");

rData.setUserId(userId);
rData.setPass(pass);
rData.setUserName(userName);
rData.setFile(fileName);

request.setAttribute("regData", rData);
%>

<jsp:forward page="regFormview.jsp" />
