<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="member.MemberBean" id="memBean"></jsp:useBean>
<!-- property="id" : 넘어오는 name="id"를 받아주고, jsp:setProperty 할 때 setter로 저장 -->
<!-- id2 setter를 못찾아서 오류 -->
<%-- <jsp:setProperty property="id2" name="memBean"/> --%>
<!-- 넘어온 id값을 무시하고 value="azaz" 적용 -->
<%-- <jsp:setProperty property="id" name="memBean" value="azaz"/> --%>
<%-- <jsp:setProperty property="id" name="memBean"/> --%>
<%-- <jsp:setProperty property="name" name="memBean"/> --%>
<!-- 한방에 하기!! -->
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:setProperty property="*" name="memBean"/>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	당신이 입력한 정보입니다.
	<hr>
	아 이 디:
<!-- 	getter로 동작 -->
	<jsp:getProperty property="id" name="memBean"/>
	<br> 이름 : 
	<jsp:getProperty property="name" name="memBean"/>
	<br> 회원구분 : 
	<%
		if(memBean.getMclass()==1){
			out.print("일반회원");
		}else{
			out.print("교수님");
		}
	%>
	<br> 전화번호 : 
	<jsp:getProperty property="phone1" name="memBean"/>
	<jsp:getProperty property="phone2" name="memBean"/>
	<jsp:getProperty property="phone3" name="memBean"/>
</body>
</html>