<%@page import="member.LoginInfo"%>
<%@page import="member.Member"%>
<%@page import="jdbc.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@page import="member.dao.MemberDao"%>
<%@page import="util.CookieBox"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String userId = request.getParameter("userid");
String pass = request.getParameter("pw");
String chk = request.getParameter("chk");

if (chk != null && chk.equals("on") && userId != null && !userId.isEmpty()) {
	// 쿠키 생성 저장해준다
	// uid =  userId를 저장하자
	response.addCookie(CookieBox.createCookie("uid", userId, "/", 60 * 60 * 24 * 365));

} else {
	// 저장하지 않기 & 저장이 되었다면 삭제하기
	response.addCookie(CookieBox.createCookie("uid", userId, "/", 0));
}

// session을 이용해서 로그인 처리 (나중에는 DB를 이용! 하지만 지금은 공부중이니까 세션으로)
// id, pw를 조건으로 mysql Member 테이블에서 select한 결과가 있으면 인증 성공

// 로그인 여부 체크
boolean loginChk = false;

MemberDao dao = MemberDao.getInstance();
Connection conn = ConnectionProvider.getConnection();

Member member = dao.selectMemberLogin(conn, userId, pass);

if(member != null){
	// 인증이 되어 로그인 처리 : session 객체에 로그인 정보를 저장
	
	// 멤버 정보를 로그인인포로 변환
	LoginInfo loginInfo = member.toLoginInfo();
	//System.out.println(loginInfo);
	
	session.setAttribute("loginInfo", loginInfo);
	
	loginChk = true;
	
	
} else{
	// 로그인 처리X
	
}


// 포워딩
if (loginChk) {
%>
<jsp:forward page="loginView.jsp" />

<%
	} else {
%>

<script>
	alert("아이디 또는 비밀번호가 일치하지 않습니다.");
	history.go(-1);
</script>
<%
	}
%>