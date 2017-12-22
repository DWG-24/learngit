<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="s" uri="/struts-tags" %>
<title>Insert title here</title>
</head>
<body>
<hr>
<form action="">
<input type="reset" value="reset"><hr>
<s:textfield label="测试文本框" name="testName"></s:textfield><br>
<s:textarea label="测试文本域" name="testArea"></s:textarea>
<s:password name="pwd" size="5" maxlength="7" showPassword="true">密码</s:password><br>

<s:radio list="{'Man','Female'}" name="gender" label="sex"></s:radio>
<s:checkboxlist list="#{1:'Man',2:'Female' }" name="gender" label="sex"></s:checkboxlist><br>
<s:select list="#{1:'Man',2:'Female' }" headerKey="" headerValue="Please select" name="gender" label="test"></s:select>

<table border="1px">
<s:iterator var="name" value="{'Java','C#','c++','c'}" status="st">
<s:if test="#st.odd">
	<tr style="background-color:white;">
		<td><s:property value="name"/></td>
	</tr>
</s:if>
<s:else>
	<tr style="background-color:gray;">	
		<td><s:property value="name"/></td>
	</tr>
</s:else>

</s:iterator>
<s:iterator begin="1" end="100" step="2">
	<s:property/>|
</s:iterator>

</table>
</form>
</body>
</html>