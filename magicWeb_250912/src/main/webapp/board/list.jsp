<%@page import="magic.board.BoardDBBean"%>
<%@page import="magic.board.BoardBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	request.setCharacterEncoding("UTF-8");
%>
<%
	BoardDBBean manager = BoardDBBean.getInstance();
	ArrayList<BoardBean> boardList = manager.listBoard();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<script>
	
</script>
	<center>
		<h1>게시판에 등록된 글 목록 보기</h1><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<table width="600" height="50">
			<tr>
				<td align="right">
					<a href="write.jsp">글 쓰 기</a>		
				</td>
			 </tr>
		</table>
	</center>
	<center>
		<table border="1" width="800" cellspacing="0">
			<tr height="25">
				<td width="40" align="center">번호</td>
				<td width="40" align="center">글제목</td>
				<td width="40" align="center">작성자</td>
				<td width="40" align="center">작성일</td>
			</tr>
			<%
			for(int i = 0; i<boardList.size(); i++){
		     %>	<tr bgcolor="#f7f7f7"
		     		onmouseover="this.style.backgroundColor='#eeeeef'"
		     		onmouseout ="this.style.backgroundColor='#f7f7f7'">
					<td align="center"><%= boardList.get(i).getB_id() %></td>
					<td align="left">
						<a href="show.jsp?b_id=<%= boardList.get(i).getB_id()%>">
							<%= boardList.get(i).getB_title() %>
						</a>
					</td>
					<td align="center">
						<a href="mailto:<%= boardList.get(i).getB_email() %>">
							<%= boardList.get(i).getB_name() %>
						</a>
					</td>
					<td align="center">
							<%= boardList.get(i).getB_date() %>
					</td>
				</tr> 
			<%
				}
			%>
		</table>
	</center>
</body>
</html>


<!-- <td width="50">번호</td>
<td width="700">글제목</td>
<td width="50"><a>작성자</a></td> -->
