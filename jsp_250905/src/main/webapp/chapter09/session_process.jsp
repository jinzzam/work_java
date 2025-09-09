<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	String id = request.getParameter("id"); 
	String pw = request.getParameter("pw"); 
	if(id.equals("admin") && pw.equals("admin1234")){
		session.setAttribute("userID", id);
// 		response.addHeader("userID", id);
		response.sendRedirect("welcome.jsp");
	}else{
		out.print("아이디와 비밀번호를 확인해주세요.");
// 		response.sendRedirect("session.jsp");
	}
%>
