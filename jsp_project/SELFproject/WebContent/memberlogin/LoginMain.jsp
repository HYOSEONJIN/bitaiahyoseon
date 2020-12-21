<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/default.css">
    
    <title>HYOSEONLOG</title>
</head>

<body>

<%@ include file="/include/header.jsp" %>
<%@ include file="/include/nav.jsp" %>
    

    
    <div class="contents">
        <div class="memberlogin">
      	  <h1>LOGIN</h1>
      	  <form action="login.jsp" method="post">
      	  		<table class="logintable">
      	  			<tr>
      	  			<td>아이디</td>
      	  			<td><input type="text" id="userId" name="userId"></td>
      	  			</tr>
      	  			
      	  			<tr>
      	  			<td>패스워드</td>
      	  			<td><input type="password" id="userPw" name="userPw"></td>    
      	  			</tr>
      <!-- 	  			
      	  			<tr>
      	  			<td colspan="2"><input type="checkbox">아이디저장</td>   
      	  			</tr>  -->
                  
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="LOGIN">
                        </td>
                    </tr>
                    <tr>
                    	<td><a href="<%= request.getContextPath()%>/memberjoin/MemberJoin.jsp">회원가입</a></td>
                    	<td><a>아이디/비밀번호 찾기</a>                    	
                    </tr>
      	  		
      	  		
      	  		</table>
      	  
      	  
      	  </form>
            
        </div>        
    </div>
    
<%@ include file="/include/footer.jsp" %>    
    

</body>

</html>
