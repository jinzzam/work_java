<%@page import="java.sql.Timestamp"%>
<%@page import="magic.board.BoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean class="magic.board.BoardBean" id="bb"></jsp:useBean>
<%
	long timeStamp = Long.parseLong(request.getParameter("localTime"));
	bb.setB_date(Integer.parseInt(request.getParameter("localTime")));
%>
<%
	
%>
<jsp:setProperty property="*" name="bb"></jsp:setProperty>
<jsp:setProperty property="b_date" name="bb"></jsp:setProperty>


<%!BoardDBBean manager = BoardDBBean.getInstance();%>
<%	
	if(manager.insertBoard(bb) == 1){
		%>
			<script>
				alert("글이 작성되었습니다.");
// 				location.href="list.jsp"
				response.sendredirect("list.jsp");
			</script>
		<%
	}else{
		%>
			<script>
				alert("글 작성에 실패했습니다.");
// 				location.href="write.jsp";
				response.sendredirect("write.jsp");
			</script>
		<%
	}
%>