<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	1. <fmt:formatNumber value="1000000"/> <br>
	2. <fmt:formatNumber value="1000000" groupingUsed="false"/><br>
	3. <c:set var="number" value="123456789"/>
	 	<fmt:formatNumber value="${number}"/><br>
	4. <fmt:formatNumber var="fNumber" value="${number}"/> 
		 ${fNumber}<br>
		 
	통화 :  <fmt:formatNumber value="${number}" type="currency" currencySymbol="원"/> , <fmt:formatNumber value="${number}" type="currency"/><br>
	퍼센트 :  <fmt:formatNumber value="${number/50000000}" type="percent"/><br>
	패턴 : <fmt:formatNumber value="${number}" pattern="000,000,000.00"/>
		

</body>
</html>