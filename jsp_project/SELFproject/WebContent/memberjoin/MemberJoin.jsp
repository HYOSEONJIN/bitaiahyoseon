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
        <div class="memberjoin">
      	  <h1>JOIN US</h1>
      	  <form action="join.jsp" method="post" enctype="multipart/form-data">
      	  		<table class="jointable">
      	  			<tr>
      	  			<td>아이디</td>
      	  			<td><input type="text" id="userId" name="userId"></td>
      	  			</tr>
      	  			
      	  			<tr>
      	  			<td>패스워드</td>
      	  			<td><input type="password" id="userPw" name="userPw"></td>    
      	  			</tr>
      	  			
      	  			<tr>
      	  			<td>이름</td>
      	  			<td><input type="text" id="userName" name="userName"></td>
      	  			</tr>
      	  			
      	  			     	  			
      	  			<tr>
      	  			<td>전화번호</td>
      	  			<td><input type="text" id="userNumber" name="userNumber"></td>
      	  			</tr>
      	  			
      	  			<tr>
      	  			<td>프로필 사진</td>
      	  			<td class="photo"><input type="file" id="userPhoto" name="userPhoto"></td>
      	  			</tr>
                    
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="JOIN">
                        </td>
                    </tr>
      	  		
      	  		
      	  		</table>
      	  
      	  
      	  </form>
            
        </div>        
    </div>
    
<%@ include file="/include/footer.jsp" %>    
    

</body>

</html>
