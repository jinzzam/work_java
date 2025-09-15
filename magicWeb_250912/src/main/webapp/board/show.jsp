<%@page import="magic.board.BoardBean"%>
<%@page import="magic.board.BoardDBBean"%>
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
	BoardDBBean manager = BoardDBBean.getInstance();
	BoardBean board = manager.getBoard(Integer.parseInt(request.getParameter("b_id")));
%>
	<center>
		<h1>글 내 용 보 기</h1><br>
		
		<table border="1" width="800" cellspacing="0">
			<tr height="25">
				<td width="40" align="center">글번호</td>
				<td width="80" align="center"><%= board.getB_id()%></td>
			</tr>
			<tr height="25">
				<td width="20" align="center">작성자</td>
				<td width="40" align="center"><%= board.getB_name()%></td>
				<td width="20" align="center">작성일</td>
				<td width="40" align="center"><%= board.getB_date()%></td>
			</tr>
			<tr height="25">
				<td width="40" align="center">글제목</td>
				<td width="80" align="left"><%= board.getB_title()%></td>
			</tr>
			<tr height="25">
				<td width="40" align="center">글내용</td>
				<td width="80" align="left"><%= board.getB_content()%></td>
			</tr>
		</table>
	</center>
</body>
</html>