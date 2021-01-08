<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>파일업로드</h1>
<hr>
<h3>@RequestParam 이용한 파일 업로드</h3>
<form action="upload1" type="POST" enctype="multipart/form-data"> 
	 <!-- /fisrtspring/upload/uploadForm > /fisrtspring/upload/upload -->
	<input type="file">
</form>

</body>
</html>