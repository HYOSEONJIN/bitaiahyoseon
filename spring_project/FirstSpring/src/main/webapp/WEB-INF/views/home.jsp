<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Index
</h1>

<ul> 
 <li>
 <c:url value="/hello" var="hello"/>
 <a href="${hello}">${hello}</a>
 </li> 
 
 <li>
 <c:url value="/member/login" var="login"/>
 <a href="${login}">${login}</a>
 </li> 
 
 
 <li>
 <c:url value="/member/search" var="member_search"/>
 <a href="${member_search}">${member_search}</a>
 </li> 
 
 <li>
 <c:url value="/order/order" var="order"/>
 <a href="${order}">${order}</a>
 </li> 
 
  <li>
 <c:url value="/cookie/make" var="make"/>
 <a href="${make}">${make}</a>
 </li> 
 
   <li>
 <c:url value="/cookie/view" var="cookiewview"/>
 <a href="${cookiewview}">${cookiewview}</a>
 </li> 
 
  
 <li>
 <c:url value="/header/header" var="header_url"/>
 <a href="${header_url}">${header_url}</a>
 </li> 

  
 <li>
 <c:url value="/search/search" var="search_url"/>
 <a href="${search_url}">${search_url}</a>
 </li> 

 <li>
 <c:url value="/upload/uploadForm" var="fileupload"/>
 <a href="${fileupload}">${fileupload}</a>
 </li> 


 <li>
 <c:url value="/member/list" var="memberlist"/>
 <a href="${memberlist}">${memberlist}</a>
 </li> 
 
 
 <li>
 <c:url value="/member/reg" var="memberreg"/>
 <a href="${memberreg}">${memberreg}</a>
 </li> 
 
 
</ul>


</body>
</html>