<%@page import="member.LoginMemberInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <header>
        <h1><font color="rebeccapurple">H</font>YOSEON<font color="rebeccapurple">L</font>OG</h1>
        
        <%
        
        	LoginMemberInfo loginInfo = (LoginMemberInfo) session.getAttribute("loginInfo");
        
        if(loginInfo==null){
        %>
        
        <a href="<%= request.getContextPath()%>/memberlogin/LoginMain.jsp" class="login_a">로그인</a>
        
        <%}else{%>
        
       <a><%= loginInfo.getUserName()%>님, 안녕하세요</a><br>
       <a href="<%= request.getContextPath()%>/memberlogin/logout.jsp">로그아웃</a>
       <a href="<%= request.getContextPath()%>/memberlogin/mypage.jsp">마이페이지&nbsp;&nbsp;</a>
        	
        <% }
        
        %>
    </header>