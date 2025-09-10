<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="question.Money" id="money"></jsp:useBean>
<jsp:setProperty property="money" name="money"/>

입력된 금액이 <%= money.getMoney() %>는 <br>
<%= money.process() %>