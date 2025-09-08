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

<%-- 	<%
		for(int i=0; i<5; i++){
			out.println("안녕하세요~" + "<br>");	
// 			out.print("안녕하세요~");	
		}
	%>
 --%>
 	<%
		for(int i=0; i<5; i++){
// 			out.println("안녕하세요~" + "<br>");	
// 			out.print("안녕하세요~");	
	%>
		안녕하세요!<br> <!-- 순수 html 코드 -->
	<% 
		}
	%>
<!-- 	스크립트릿을 범위를 나누어 사용할 수도 있다 -->
</body>
</html>