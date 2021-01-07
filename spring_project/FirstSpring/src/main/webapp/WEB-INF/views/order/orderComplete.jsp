<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>주문정보</h1>
	
	<h3>상품 주문 정보</h3>
	
	<c:forEach items="${uo.orderItems}" var="oi">
		<div>
			상품 ID : ${oi.itemId} / 개수 : ${oi.number}개 / 주의사항 : ${oi.remark} 	
		</div>	
	</c:forEach>
	
	<h3>배송지</h3>
	<div>
	
		우편번호 : ${uo.address.zipcode}
		주소1 :  ${uo.address.address1}
		주소2 :  ${uo.address.address2}
	</div>
	
</body>
</html>