<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test</title>
</head>
<body>

<%-- <form action="${pageContext.request.contextPath }/reg.action">
	姓名:<input type="text" name="map['first'].name"><br>
	年龄:<input type="text" name="map['first'].age"><br>
	姓名:<input type="text" name="map['second'].name"><br>
	年龄:<input type="text" name="map['second'].age"><br>
	<input type="submit" value="提交">
</form> --%>
<form action="${pageContext.request.contextPath }/reg.action">
	姓名:<input type="text" name="name"><br>
	年龄:<input type="text" name="age"><br>
	<input type="submit" value="提交">
</form>

<%-- <form action="${pageContext.request.contextPath }/reg.action">
	姓名:<input type="text" name="list"><br>
	年龄:<input type="text" name="list[3]"><br>
	<input type="submit" value="提交">
</form> --%>
</body>
</html>