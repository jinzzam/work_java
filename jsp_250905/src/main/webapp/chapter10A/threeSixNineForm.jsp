<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="question.ThreeSixNine" id="threeSixNine"></jsp:useBean>
<jsp:setProperty property="number" name="threeSixNine"/>

<h4>당신이 입력한 정보입니다.</h4>
입력된 정수가 <%= threeSixNine.getNumber() %>은
<%= threeSixNine.process(threeSixNine.getNumber()) %>