
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="question.Capital" id="capital"></jsp:useBean>
<jsp:setProperty property="str" name="capital"/>

입력된 알파벳이 <%= capital.getStr() %>는 <br>
<%= capital.process() %>