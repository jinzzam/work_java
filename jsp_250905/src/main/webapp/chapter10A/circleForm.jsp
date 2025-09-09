<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean class="area.Circle2" id="circle"></jsp:useBean>
<jsp:setProperty property="radius" name="circle"/>
<h4>당신이 입력한 정보입니다.</h4><br>

<%
	out.print("반지름이 " + circle.getRadius() + "인 원의 면적은 "
			+ circle.process(circle.getRadius()));
%>