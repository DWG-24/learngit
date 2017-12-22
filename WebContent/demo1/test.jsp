<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="s" uri="/struts-tags" %>
<title>test</title>
</head>
<body>
<h3>Test</h3>
<a href="${pageContext.request.contextPath }/dwg/struts_execute.action">访问strutsDemo1.Action</a><br>
<a href="${pageContext.request.contextPath }/dwg/struts_save.action">访问save.Action</a><br>
<a href="${pageContext.request.contextPath }/dwg/struts_toAction.action">访问SturctsDemo2.Action</a><br>
<a href="${pageContext.request.contextPath }/testOgnl.action">访问testOgnl.Action</a><br>
<a href="${pageContext.request.contextPath }/myInterceptor.action">访问myInterceptor.Action</a><br>

<s:if test="8<5">
	HELLO : 8!=5
</s:if>
<s:elseif test="8>5">
	haha: 8&gt;5
	haha: 8&lt;5
</s:elseif>
<s:else>
	8=8
</s:else>
</body>
</html>