<%@page import="util.CookieBox"%>
<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

	CookieBox cookieBox = new CookieBox(request);
	
 
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

userID = <%= cookieBox.getValue("userID") %><br>
Age = <%= cookieBox.getCookie("age").getValue() %><br>
nickName이 존재하는가? = <%= cookieBox.exists("nickName") %>

<%--  <%
 
 	// 쿠키 가져오기!
 	Cookie[] cookies = request.getCookies();
 
 	if(cookies != null && cookies.length>0){
 		
 		for(int i=0; i<cookies.length; i++){
 			String name = cookies[i].getName();
 			String value = URLDecoder.decode(cookies[i].getValue(),"UTF-8");
 			
 			out.println("<h1>"+name+" : "+value+"</h1>");
 		}
 		
 	}else{
 		out.println("<h1>저장된 쿠키가 없습니다.</h1>");
 		
 	}
 
 %> --%>
 

 
 <h1><a href="editCookie.jsp">쿠키 수정하기</a></h1>
 <h1><a href="deleteCookie.jsp">쿠키 삭제하기</a></h1>

</body>
</html>