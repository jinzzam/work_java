<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="area.Circle" id="circleBean" scope="page"></jsp:useBean>
<jsp:setProperty property="radius" name = "circleBean" />
<h4>원의 면적 출력하기</h4><br>
반지름이 
<jsp:getProperty property="radius" name = "circleBean" />인 
원의 면적은 
<jsp:getProperty property="area" name="circleBean"/>

