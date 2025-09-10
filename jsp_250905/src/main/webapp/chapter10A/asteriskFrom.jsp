<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="question.Asterisk" id="asterisk"></jsp:useBean>
<jsp:setProperty property="number" name="asterisk"/>

입력된 정수가 <%= asterisk.getNumber() %>는 <br>
<%= asterisk.process(asterisk.getNumber()) %>