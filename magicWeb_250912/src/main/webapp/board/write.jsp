<%@page import="java.time.LocalDateTime"%>
<%@page import="java.sql.Timestamp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<%
	long currentTimeMillis = System.currentTimeMillis();
	Timestamp currentTimestamp = new Timestamp(currentTimeMillis);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="board.js"></script>
</head>
<body>
	<center>
		<h1>글 올리기</h1><br>
		<form method="post" action="write_ok.jsp?localTime=<%= currentTimestamp %>" name="write_frm">
			<table>
				<tr height="30">
					<td width="80">작성자</td>
					<td width="140">
<!-- 					maxlength : 화면 단에서 데이터베이스 오류를 미리 방지 -->
						<input type="text" name="b_name" size="10" maxlength="20">
					</td>
					<td width="80">이메일</td>
					<td width="240">
						<input type="text" name="b_email" size="24" maxlength="50">
					</td>
				</tr>
				<tr height="30">
					<td width="80">글제목</td>
					<td width="460" colspan="3">
						<input type="text" name="b_title" size="55" maxlength="80">
					</td>
				</tr>
				<tr height="30">
					<td colspan="4">
						<textarea name="b_content" cols="65" rows="10" style="﻿overflow-y:scroll; overflow-x:hidden;"></textarea>
					</td>
				</tr>
				<tr height="50" align="center">
					<td colspan="4">
						<input type="button" value="글쓰기" onclick="check_ok()">&nbsp;
						<input type="reset" value="다시 작성">
						<input type="button" value="글목록" onclick="location.href='list.jsp'">&nbsp;
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>