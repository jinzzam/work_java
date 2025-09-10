<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="question.Array3" id="array"></jsp:useBean>
<jsp:setProperty property="n" name="array"/>

입력된 정수의 갯수 <%= array.getN() %>는 <br>
<%= array.process() %>
