<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Phonebook Test</title>
</head>
<body>
	<form action="phonebookResult.jsp" method="get">
		<table>
			<tr>
				<td>이름</td>
				<td><input type="text" name="Pname"></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="pnum"></td>
			</tr>
			<tr>
				<td>친구타입</td>
				<td><select name="ftype">
						<option value="대학">대학</option>
						<option value="고교">고교</option>
						<option value="회사">회사</option>
				</select></td>
			</tr>
			<tr>
				<td>특징</td>
				<td><input type="checkbox" name="character" value="착함">착함<br>
					<input type="checkbox" name="character" value="언니가있음">언니가있음<br>
					<input type="checkbox" name="character" value="오빠가있음">오빠가있음<br>
					<input type="checkbox" name="character" value="친절함">친절함<br></td>
			</tr>
			<tr>
				<td colspan="2"><center><input type="submit" value="저장"></center></td>
			</tr>
		</table>
	</form>

</body>
</html>