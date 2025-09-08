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
		for(int i=0; i<10; i++){
			if(i%2 == 0){
			out.println(i + "<br>");	
				
			}
		}
	%>

</body>
</html>