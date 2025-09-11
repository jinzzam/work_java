<%@page import="javax.naming.NamingException"%>
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
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		try{
// 			Context ctx = new InitialContext();
// 			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle");
// 			conn = ds.getConnection();
			conn = ((DataSource) (new InitialContext().lookup("java:comp/env/jdbc/oracle"))).getConnection();
		}catch(NamingException ne){
			ne.printStackTrace();
		}catch(SQLException ex){
			out.print("데이터베이스 연결이 실패했습니다.");
			out.print(ex.getMessage());
		}
	
		String id="", name="", vclass="", tel="";
		id = request.getParameter("id");
		name = request.getParameter("name");
		vclass = request.getParameter("mclass");
		tel = request.getParameter("tel");
	
		out.print("@# id => " + id);
		out.print("@# name => " + name);
		out.print("@# vclass => " + vclass);
		out.print("@# tel => " + tel);
		
		StringBuffer updateQuery = new StringBuffer();
		updateQuery.append("update member2 set name=?, class=?, tel=? where id=?");

		try{
			pstmt = conn.prepareStatement(updateQuery.toString());
			pstmt.setString(1, name);
// 			pstmt.setString(2, vclass); oracle 가서 casting (속도저하)
			pstmt.setInt(2, Integer.parseInt(vclass));
			pstmt.setString(3, tel);
			pstmt.setString(4, id);
			// 정상적으로 수정 시 1이 반환됨
			int re = pstmt.executeUpdate(); 
			
			if(re == 1){
				%>
				<%= id %>의 정보가 수정되었습니다.<br>
				[<a href="viewMemberOracle.jsp">목록보기</a>]
				<%
			} else{ %>
				변경 실패
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
