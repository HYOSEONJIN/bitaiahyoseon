<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    
    session.invalidate(); // 현재세션 소멸 > loginInfo 데이터삭제
    response.sendRedirect(request.getContextPath());
    
    
    %>