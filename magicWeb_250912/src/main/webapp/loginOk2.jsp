<%-- <%@page import="javax.websocket.Session"%> --%>
<%@page import="magic.member.MemberBean"%>
<%@page import="magic.member.MemberDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<%
	String id = request.getParameter("mem_uid");
	String pwd = request.getParameter("mem_pwd");
	MemberDBBean manager = MemberDBBean.getInstance();
	int check = manager.userCheck(id, pwd);
	MemberBean member = manager.getMember(id);
// 	Session session  = null;
%>
<%-- <jsp:useBean class="magic.member.MemberBean" id="mb"></jsp:useBean> --%>
<%-- <jsp:setProperty property="*" name="member"></jsp:setProperty> --%>

<%-- <%! --%>
// 	MemberDBBean manager = MemberDBBean.getInstance();
// // 	Session session  = null;
<%-- %> --%>
	<%
		if(member == null){
			%>
			<script>
			alert("존재하지 않는 회원.");	
			reg_frm.mem_uid.focus();
			history.back();	//바로 직전 화면으로
			</script>
			<%
		}else{
			String name = member.getMem_name();
			if(check == 1) { //세션에 사용자 정보 추가 후 main.jsp로 이동
// 				session.setAttribute("mem_uid", request.getParameter("mem_uid"));
				session.setAttribute("uid", id);
				session.setAttribute("name", name);
				response.sendRedirect("main.jsp");
			%>
			}else if(check == 0){
			%><script>
				alert("비밀번호가 맞지 않습니다.");
				history.back();
			</script><%
			}
		}
	%>