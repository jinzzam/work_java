<%@page import="java.text.SimpleDateFormat"%>
<%@page import="magic.board.BoardBean"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="board.js"></script>
</head>
<body>
<%
	int b_id = Integer.parseInt(request.getParameter("b_id"));
	BoardDBBean manager = BoardDBBean.getInstance();
	BoardBean board = manager.getBoard(b_id, true);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
%>
	<center>
		<h1>글 내 용 보 기</h1><br>
		
		<table border="1" width="800" cellspacing="0">
			<tr height="25">
				<td width="20" align="center">글번호</td>
				<td width="40" align="center"><%= board.getB_id()%></td>
				<td width="20" align="center">조회수</td>
				<td width="40" align="center"><%= board.getB_hit()%></td>
			</tr>
			<tr height="25">
				<td width="20" align="center">작성자</td>
				<td width="40" align="center"><%= board.getB_name()%></td>
				<td width="20" align="center">작성일</td>
				<td width="40" align="center"><%= sdf.format(board.getB_date())%></td>
			</tr>
			<tr height="25">
				<td width="40" align="center">글제목</td>
				<td width="80" align="left"><%= board.getB_title()%></td>
			</tr>
			<tr height="25">
				<td width="40" align="center">글내용</td>
				<td width="80" align="left"><%= board.getB_content()%></td>
			</tr>
			<tr height="25" align="right" colspan="4">
				<td></td>
				<td width="40" align="right"><input type="button" value="글수정" onclick="location.href='edit.jsp?b_id=<%= board.getB_id()%>'"></td>
				<td width="40" align="right"><input type="button" value="글삭제" onclick="location.href='delete.jsp?b_id=<%= board.getB_id()%>'"></td>
				<td width="40" align="right"><input type="button" value="글목록" onclick="location.href='list.jsp'"></td>
			</tr>
		</table>
	</center>
</body>
</html>