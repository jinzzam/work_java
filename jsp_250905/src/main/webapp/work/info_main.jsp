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
		String select = request.getParameter("pageChange");
		if(select == null){
			select = "info_notice.jsp";
		}
	%>

	<table border="1" width="1000" height="700">
		<tr>
			<td colspan="2"><jsp:include page="info_header.jsp"></jsp:include>
			</td>
		</tr>
		<tr>
			<td><jsp:include page="info_programming.jsp"></jsp:include></td>
<%-- 		<td><jsp:include page="info_notice.jsp"></jsp:include></td> --%>
			<td><jsp:include page="<%= select %>"></jsp:include></td>
			
		</tr>
		<tr>
			<td colspan="2"><jsp:include page="info_footer.jsp"></jsp:include>
			</td>
		</tr>

	</table>

</body>
</html>

<%-- <script type="text/javascript"> -->
// 	function changeContent(menuName) {
// 		const contentArea = document.getElementById('main-content');
// 		contentArea.innerHTML = menuName + '입니다.';
// 	}
<!-- </script> -->

 <a href="#" onclick="changeContent('CSS')">CSS</a>  --%>