<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h3>[스크립트릿(scriptlet)에 관한 예제]</h3>
	</center>
	<hr>

	<%
		Date date = new Date();
// 		import를 하는 이유
// 		java.util.Date date = new java.util.Date(); 
		out.print(date);
	%>

</body>
</html>