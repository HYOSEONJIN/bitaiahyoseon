<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<nav>
		<ul>
			<li><a href="<%= request.getContextPath()%>">HOME</a></li>
	
			<%
				if(session.getAttribute("loginInfo")==null){
							
			%>
			<li><a href="<%= request.getContextPath()%>/member/memberRegForm.jsp">회원가입</a></li>
			<li><a href="<%= request.getContextPath()%>/member/loginForm.jsp">로그인</a></li>
			
			<%
			} else {
			
			%>			
			
			<li><a href="<%= request.getContextPath()%>/member/logout.jsp">로그아웃</a></li>
			
			<%
			}
			%>
			
			
			<li><a href="<%= request.getContextPath()%>/member/mypage/mypage1.jsp">마이페이지1</a></li>
			<li><a href="<%= request.getContextPath()%>/member/mypage/mypage2.jsp">마이페이지2</a></li>
			<li><a href="#">HOME</a></li>
		</ul>
	</nav>
