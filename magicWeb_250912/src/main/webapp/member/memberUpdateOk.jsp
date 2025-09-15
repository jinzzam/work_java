<%@page import="magic.member.MemberBean"%>
<%@page import="magic.member.MemberDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="magic.member.MemberBean" id="member"></jsp:useBean>
<jsp:setProperty property="*" name="member"/>
<%

	String uid = (String) session.getAttribute("mem_uid"); 
    MemberDBBean manager = MemberDBBean.getInstance();
	member = (MemberBean) manager.getMember("mem_uid");

	if(member!=null){
%>
			<script>
				alert("입력하신 대로 회원 정보가 수정되었습니다.");
				location.href="main.jsp";
			</script>
		<%
	}else{
		%>
			<script>
				alert("수정이 실패했습니다.");
				history.go(-1);
			</script>
		<%
	}
%>