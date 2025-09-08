<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	if (id.equals("admin") && pw.equals("admin1234")) {
		Cookie cookie = new Cookie("admin", id);
		cookie.setMaxAge(365 * 24 * 60 * 60);
		cookie.setPath("/");
		response.addCookie(cookie);
		response.sendRedirect("welcome.jsp");
	} else {
		out.print("아이디와 비밀번호를 확인해 주세요.");
	}
%>

