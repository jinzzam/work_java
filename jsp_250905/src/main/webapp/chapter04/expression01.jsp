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
	<p>
		Today's date:
<%-- 		<%=  --%>
<!--  		; 오류. 표현식 쓸 때는 ; 쓰면 안 된다. -->
<!--  			new Date(); -->
 			
		<%= new Date() %>
	</p>
</body>
</html>