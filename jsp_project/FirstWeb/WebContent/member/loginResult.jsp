<%@page import="util.CookieBox"%>
<%@page import="form.LoginFormData"%>
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
// id, pw 비교해서 같으면 로그인 성공!, 다르면 실패

boolean loginChk = false;

//로그인처리
if (userId.equals(pass)) {

	//빈즈생성
	LoginFormData lfData = new LoginFormData();

	// 데이터바인딩
	lfData.setUserId(userId);
	lfData.setPass(pass);

	// 데이터 공유
	request.setAttribute("loginData", lfData);
	
	// 로그인 정보를 session 객체의 속성에 저장
	session.setAttribute("loginInfo", lfData);

	loginChk = true;

} else {
	//로그인 실패

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