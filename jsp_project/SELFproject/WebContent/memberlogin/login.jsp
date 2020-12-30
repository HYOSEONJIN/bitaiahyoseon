
<%@page import="member.model.LoginMemberInfo"%>
<%@page import="member.model.Member"%>
<%@page import="jdbc.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@page import="member.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

String uid = request.getParameter("userId");
String pw = request.getParameter("userPw");

boolean Chk = false;

MemberDao dao = MemberDao.getinstance();
Connection conn = ConnectionProvider.getConnection();

Member member = dao.Login(conn, uid, pw);

System.out.println(member);
if(member!=null){
	
	LoginMemberInfo loginInfo = member.toLMI();
	session.setAttribute("loginInfo", loginInfo);
	
Chk=true;

} 



if(Chk){
	%>
<jsp:forward page="/"/>

<%
}else{
%>
<script>
alert("아이디 또는 비밀번호가 일치하지 않습니다.");
history.go(-1);

</script>
<%
}
%>
