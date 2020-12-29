<%@page import="member.service.MemberRegService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// MemberRegService
// inserMember > 1or0

MemberRegService service = MemberRegService.getInstance();
service.InserMember(request);

// 이 페이지의 역할 : 컨트롤러
// 사용자의 요청에 맞는 서비스 클래스 선택 > 메소드 실행
// view 페이지를 선택하고 포워드

%>
<jsp:forward page="memberRegView.jsp" />




