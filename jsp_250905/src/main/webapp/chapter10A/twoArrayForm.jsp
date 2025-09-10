<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="question.TwoArray" id="array2"></jsp:useBean>
<jsp:setProperty property="n" name="array2"/>

<%= array2.getN() %> * <%= array2.getN() %>는 <br>
<%= array2.process() %>
