<%@page import="member.LoginMemberInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <header>
        <h1><font color="rebeccapurple">H</font>YOSEON<font color="rebeccapurple">L</font>OG</h1>
        
        <%
        
        	LoginMemberInfo loginInfo = (LoginMemberInfo) session.getAttribute("loginInfo");
        
        if(loginInfo==null){
        %>
        
        <a href="<%= request.getContextPath()%>/memberlogin/LoginMain.jsp">로그인</a>
        
        <%}else{%>
        
        <a href="<%= request.getContextPath()%>/memberlogin/mypage.jsp"><%= loginInfo.getUserName()%>님, 안녕하세요</a>
        	
        <% }
        
        %>
    </header>