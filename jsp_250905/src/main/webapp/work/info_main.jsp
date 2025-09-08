<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	static String curr_main = "공지사항";
%>

<% curr_main = request.getParameter("curr_main"); %>

	<table border = 1>
		<tr>
			<td colspan="2">
			<%@ include file="info_header.jsp" %>
			</td>
		</tr>
		<tr>
			<td>
			<%@ include file="info_programming.jsp" %>
			</td>
			<td>
			<%= curr_main %>입니다.
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<%@include file="info_footer.jsp" %>
			</td>
		</tr>
	
	</table>

</body>
</html>