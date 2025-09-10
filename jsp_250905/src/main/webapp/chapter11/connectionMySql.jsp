<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Connection conn = null;
	
		try {
			String url = "jdbc:mysql://localhost:3306/jspdb";
			String user = "root";
			String password = "1234";
	
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			out.print("데이터 베이스 연결이 성공했습니다.");
		} catch (SQLException ex) {
			out.print("데이터 베이스 연결이 실패했습니다-SQLException");
			out.print(ex.getMessage());
		} catch (ClassNotFoundException e) {
			out.print("데이터 베이스 연결이 실패했습니다-ClassNotFoundException");
			out.print(e.getMessage());
		} finally {
			if (conn != null) {
				conn.close();
			}
		}
	%>
</body>
</html>