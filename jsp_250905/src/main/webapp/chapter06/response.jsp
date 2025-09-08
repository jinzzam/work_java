<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setIntHeader("Refresh",5);
		Calendar calendar = Calendar.getInstance();
		
		String am_pm;
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		if(calendar.get(Calendar.AM_PM)==0){
			am_pm="AM";
		}else{
			am_pm="PM";
		}
		
		String CT = hour + " : " + minute+" : "+second +am_pm;
		out.print("현재 시간은" + CT + "<br>");
	%>
	<a href="response_data.jsp">
	Google 홈페이지로 이동하기
	</a>
</body>
</html>