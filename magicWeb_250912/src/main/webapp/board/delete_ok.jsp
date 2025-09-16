<%@page import="magic.board.BoardBean"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean class="magic.board.BoardBean" id="board"></jsp:useBean>
<jsp:setProperty property="*" name="board"></jsp:setProperty>

<%
	int b_id = Integer.parseInt(request.getParameter("b_id"));
	String b_pwd = request.getParameter("b_pwd");

	BoardDBBean db = BoardDBBean.getInstance();
	int re = db.deleteBoard(b_id, b_pwd);
	
	if(re == 1){
		response.sendRedirect("list.jsp");
	}else if(re == 0){
	%>
		<script>
			alert("비밀번호가 틀렸습니다.");		
			history.go(-1);
		</script>
	<%
	} else if (re == -1){
	%>
		<script>
			alert("삭제에 실패했습니다.");
			history.go(-1);
		</script>
	<%
	}
	%>