<%@page import="member.Member"%>
<%@page import="member.dao.MemberDao"%>
<%@page import="jdbc.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%

int Chk = 0;

Connection conn = ConnectionProvider.getConnection();
MemberDao dao = MemberDao.getinstance();

//연결이 됐다면
if(conn!=null){
	request.setCharacterEncoding("UTF-8");
	

	String userId = request.getParameter("userId");
	String userPw = request.getParameter("userPw");
	String userName = request.getParameter("userName");
	String userPhoto = request.getParameter("userPhoto");
	String userNumber = request.getParameter("userNumber");
	
	Member member = new Member();
	member.setUserId(userId);
	member.setUserPw(userPw);
	member.setUserPhoto(userPhoto);
	member.setUserName(userName);
	member.setUserNumber(userNumber);
	
	System.out.println(member);
	
	Chk = dao.inserMember(conn, member);
	
	System.out.println(Chk);
}

if(Chk>0){
%> <script>
	alert('회원가입 완료');
	location.href="<%=request.getContextPath()%>";
</script>

<%}else{
	%>
	<script>
	alert('중복된 아이디입니다');
	history.go(-1);
	</script>
	
<%
}

%>
