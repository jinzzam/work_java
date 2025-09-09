<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="question.DivAndRemains" id="divBean" scope="page"></jsp:useBean>
<jsp:setProperty property="number" name="divBean"/>
<h4>당신이 입력한 정보입니다.</h4>
입력된 정수가 
<%= divBean.getNumber() %>
은(는) 10의 자리와 1의 자리가 
<%
	if(divBean.process(divBean.getNumber())==true){
		out.print("같습니다.");
	}else{
		out.print("다릅니다.");
	}
%>