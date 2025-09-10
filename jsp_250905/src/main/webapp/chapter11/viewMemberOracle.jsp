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
	// 쿼리문 이용을 위한 인터페이스
	Statement stmt = null;
	// 쿼리 결과를 받기 위한 인터페이스
	ResultSet rs = null;
	
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";
	String sql= "select id, name, class, tel from member2";
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
// 			생략 가능
// 			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
// 			createStatement() 메소드 호출해서 쿼리 이용하는 Statement 객체 생성
			stmt = conn.createStatement();
// 			쿼리 결과는 ResultSet으로 담는다.			
			rs = stmt.executeQuery(sql);
			
// 			next() : 쿼리 결과가 있으면 참
			while(rs.next()){
				%>
				<tr>
<!-- 				getString() : 문자타입의 컬럼 값 받을 때 사용 -->
					<td><%= rs.getString("id") %> </td>
					<td><%= rs.getString("name") %> </td>
<!-- 				getInt() : 숫자타입의 컬럼 값 받을 때 사용 -->
					<td><%= rs.getInt("class") %> </td>
					<td><%= rs.getString("tel") %> </td>
				</tr>
				<%
			}
// 			out.print("데이터 베이스 연결이 성공했습니다.");
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
