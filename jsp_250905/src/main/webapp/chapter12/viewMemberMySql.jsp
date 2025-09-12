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
	Statement stmt = null;
	ResultSet rs = null;
	
	String url="jdbc:mysql://localhost:3306/jspdb";
	String user = "bts";
	String password = "1234";
	String sql= "select id, name, class, tel from member2";
	String sclass = "일반회원";
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="400" border="1">
		<tr>
			<td>아이디</td>
			<td>이름</td>
			<td>등급</td>
			<td>전화번호</td>
		</tr>
	<%
		try{
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				%>
				<tr>
<%-- 					<td><%= rs.getString("id") %> </td> --%>
					<td>
<!--
*. 데이터 넘기는 방법
1번을 실무에서 많이 사용 : 수정(클릭하는 시점을 반영)
1. 해당 키 (ex.아이디)만 넘길 때
	아이디를 가지고 가서 조회
	select ~ where id = ?
	
2. 모든 데이터 넘길 때
	?id= &name= &tel=
 -->
					<a href="updateMemberMySql.jsp?id=<%= rs.getString("id") %>">
						<%= rs.getString("id") %> 
					</a>
					</td>
					<td><%= rs.getString("name") %> </td>
<%-- 					<td><%= rs.getInt("class") %> </td> --%>
					<td>
						<% 
							int n_class = rs.getInt("class");
							if(n_class == 2) {
								sclass="교수님";
							}else{
								sclass="일반회원";
							}
						%>
						<%= sclass %>
					 </td>
					<td><%= rs.getString("tel") %> </td>
				</tr>
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
	</table>
</body>
</html>
