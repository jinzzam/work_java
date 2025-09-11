<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String url="jdbc:mysql://localhost:3306/jspdb";
	String user = "bts";
	String password = "1234";
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		String id="", pw="", name="", mclass="", phone1="", phone2="", phone3="";
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		name = request.getParameter("name");
		mclass = request.getParameter("mclass");
		phone1 = request.getParameter("phone1");
		phone2 = request.getParameter("phone2");
		phone3 = request.getParameter("phone3");
		
		try{
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
// 			rs = stmt.executeQuery(sql);
			StringBuffer insertQuery = new StringBuffer();

// 			insert 쿼리 조립
			insertQuery.append("insert into member2 values('");		
			insertQuery.append(id + "', '");		
			insertQuery.append(pw + "', '");		
			insertQuery.append(name + "', '");		
			insertQuery.append(mclass + "', '");		
			insertQuery.append(phone1+"-"+phone2+"-"+phone3+"')");		

			out.print(insertQuery);
// 			executeUpdate() : insert 할 때 사용됨
			int re = stmt.executeUpdate(insertQuery.toString());

			if(re == 1){
				%>
				추가 성공<br>
				<a href="addFormMySql.html">추가 작업</a>
				<a href="viewMemberMySql.jsp">조회 작업</a>
				<%
			}else{
				%>
					<font color="red">추가 실패 ㅠ.ㅠ</font>
				<%
			}
		}catch(SQLException ex){
			out.print("데이터 베이스 연결이 실패했습니다.");
			out.print(ex.getMessage());
		}finally{
			try {
			if(rs != null){ rs.close(); }
			if(stmt != null){ stmt.close(); }
			if(conn != null){ conn.close(); }
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
	%>
</body>
</html>
