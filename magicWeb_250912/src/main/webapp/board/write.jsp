<%@page import="magic.board.BoardBean"%>
<%@page import="magic.board.BoardDBBean"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.sql.Timestamp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<%
	String pageNum=request.getParameter("pageNum");
	
	int b_id=0, b_ref=0, b_step=0, b_level=0;
	String b_title="", b_email="", b_name="";
	
	//답변글(show.jsp 에서 글번호를 가지고 옴)
	if(request.getParameter("b_id") != null){	//casting 오류를 막기 위함
		b_id = Integer.parseInt(request.getParameter("b_id")) ;	
		b_ref = b_id;
	}
	
	BoardDBBean db = BoardDBBean.getInstance(); 
	BoardBean board = db.getBoard(b_id, false);
	
	if(board != null){	//답변글이라면
// 		db에 insert 하기 위한 로직
		board.setB_ref(b_ref);
		b_step = board.getB_step();
		b_level = board.getB_level();
		b_title = board.getB_title();
		b_email = board.getB_email();
		b_name = board.getB_name();
	}
%>
<!-- select b_id, b_name, b_email, b_title, b_content, b_date, b_hit, b_pwd, b_ip from boardT where b_id=? -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="board.js"></script>
</head>
<body>
	<center>
		<h1>글 올 리 기</h1><br>
		<form method="post" action="write_ok.jsp" name="write_frm" enctype="multipart/form-data">
<!-- 			화면에 없는 것을 전달할 때 hidden 사용 -->
			<input type="hidden" name="b_id" value="<%= b_id %>">
			<input type="hidden" name="b_ref" value="<%= b_ref %>">
			<input type="hidden" name="b_step" value="<%= b_step %>">
			<input type="hidden" name="b_level" value="<%= b_level %>">
			<input type="hidden" name="b_name" value="<%= b_name %>">
			<table>
				<tr height="30">
					<td width="80">작성자</td>
					<td width="140">
<!-- 					maxlength : 화면 단에서 데이터베이스 오류를 미리 방지 -->
						<input type="text" name="b_name" size="10" maxlength="20" value="<%= b_name %>">
					</td>
					<td width="80">이메일</td>
					<td width="240">
						<input type="text" name="b_email" size="24" maxlength="50" value="<%= b_email %>">
					</td>
				</tr>
				<tr height="30">
					<td width="80">글제목</td>
					<td width="460" colspan="3">
<!-- 						<input type="text" name="b_title" size="55" maxlength="80"> -->
						<%
							//[답변]: 의 존재 여부
							if(b_id == 0){ //신규글
								%>
								<input type="text" name="b_title" size="55" maxlength="80">
								<%
							}else{	//답변글
								%>
								<input type="text" name="b_title" size="55" maxlength="80" value="[답변]:<%= b_title %>">
								<%
							}
						%>
					</td>
				</tr>
				<tr height="30">
					<td colspan="3">
						파&nbsp;&nbsp;일&nbsp;&nbsp;<input type="file" name="b_fname" size="40" maxlength="100">
					</td>
				</tr>
				<tr height="30">
					<td colspan="4">
						<textarea name="b_content" cols="65" rows="10" style="﻿overflow-y:scroll; overflow-x:hidden;"></textarea>
					</td>
				</tr>
				<tr height="30">
					<td colspan="2">
						암&nbsp;&nbsp;호&nbsp;&nbsp;<input type="password" name="b_pwd" size="12" maxlength="12">
<!-- 					maxlength: 컬럼의 크기와 맞추기 -->
					</td>
				</tr>
				<tr height="50" align="center">
					<td colspan="4">
						<input type="submit" value="글쓰기" onclick="check_ok()">&nbsp;
						<input type="reset" value="다시 작성">&nbsp;
						<input type="button" value="글목록" onclick="location.href='list.jsp?pageNum=<%= pageNum %>'">
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>