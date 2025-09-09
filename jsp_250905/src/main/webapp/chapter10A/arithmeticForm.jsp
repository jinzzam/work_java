<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="question.Arithmetic" id="arithBean"></jsp:useBean>
<%-- <jsp:setProperty property="num1" name="arithBean"/> --%>
<%-- <jsp:setProperty property="num2" name="arithBean"/> --%>
<%-- <jsp:setProperty property="op" name="arithBean"/> --%>
<jsp:setProperty property="*" name="arithBean"/>

<h4>당신이 입력한 정보입니다.</h4>
<%= arithBean.getNum1() %>
<%= arithBean.getOp() %>
<%= arithBean.getNum2() %>의
계산 결과는 <%= arithBean.process(arithBean.getOp()
							 , arithBean.getNum1()
							 , arithBean.getNum2()) %>