<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<%!
	Connection conn = null;
	DataSource ds = null;
// 	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
// 	String url="jdbc:oracle:thin:@localhost:1521:xe";
// 	String user = "scott";
// 	String password = "tiger";
// 	String sql= "select id, name, class, tel from member2";
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		try{
			Context ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/mysql");
			conn = ds.getConnection();
			
			StringBuffer selectQuery = new StringBuffer();
			String id = request.getParameter("id");
			selectQuery.append("select id, name, class, tel from member2 where id=?");
// 			dbcp 연결 정보 객체(conn)를 가지고, preparedStatement 메소드 호출해서
// 			preparedStatement 객체 생성해서 쿼리 사용
			pstmt = conn.prepareStatement(selectQuery.toString());
// 			setString 메소드 : 쿼리 파라미터 값을 저장
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
// 			while(rs.next()){
			if(rs.next()){
				%>
				<form method="post" action="updateProcessMySql.jsp">
						아이디 : <input type="text" name="id" value="<%= id %>"><br>
						이름 : <input type="text" name="name" value="<%= rs.getString("name") %>">
						회원등급 : <input type="text" name="mclass" value="<%= rs.getInt("class") %>">
						전화번호 : <input type="text" name="tel" value="<%= rs.getString("tel") %>">
						<input type="submit" value="수정">
						<a href="viewMemberMySql.jsp">목록보기</a>
				</form>
				<%
			} else{ %>
				<font color="red">아이디 없3~!</font>
				<a href="viewMemberMySql.jsp">목록보기</a>
			<%
			}
			
		}catch(SQLException ex){
			out.print("데이터 베이스 연결이 실패했습니다.");
			out.print(ex.getMessage());
		}finally{
			try {
			if(rs != null){ rs.close(); }
			if(pstmt != null){ pstmt.close(); }
			if(conn != null){ conn.close(); }
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
	
	%>
</body>
</html>
