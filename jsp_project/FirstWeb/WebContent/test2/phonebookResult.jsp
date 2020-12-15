<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result</title>
</head>
<body>

	<table>
		<tr>
			<td>이름</td>
			<td><%=request.getParameter("pname")%></td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td><%=request.getParameter("pnum")%></td>
		</tr>
		<tr>
			<td>친구타입</td>
			<td><%=request.getParameter("ftype")%></td>
		</tr>
		<tr>
			<td>성격</td>
			<td>
				<%
					String[] character = request.getParameterValues("character");

				for (int i = 0; i < character.length; i++) {
					out.println(character[i] + ",");
				}
				%>

			</td>
	</table>


</body>
</html>