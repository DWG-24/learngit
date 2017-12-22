package com.njtech.struts.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServlet;

import org.apache.struts2.ServletActionContext;
import org.junit.Test;

import com.njtech.struts.bean.Employee;
import com.njtech.struts.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ognl.OgnlValueStack;
import com.opensymphony.xwork2.util.CompoundRoot;
import com.opensymphony.xwork2.util.ValueStack;
import com.sun.org.apache.xpath.internal.functions.Function3Args;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class App extends ActionSupport{
	
	public String interceptorTest(){
		System.out.println("执行App的interceptorTest()方法！");
		return SUCCESS;
	}
	
	@Test
	public void fun2() throws OgnlException{
		OgnlContext context = new OgnlContext();
//		User rootUser = new User();
//		rootUser.setName("hello");
//		rootUser.setAge(22);
		
//		Map<String, User> map = new HashMap<>();
//		map.put("user1", new User("dwg1",33));
//		map.put("user2", new User("dwg2",43));
//		
//		context.setRoot(rootUser); 
//		context.setValues(map);
		
		Integer value1 = (Integer) Ognl.getValue("{'str1','str2','str3'}.size()",context,context.getRoot());
		String value2 = (String) Ognl.getValue("{'str1','str2','str3'}[2]",context,context.getRoot());
		String value3 = (String) Ognl.getValue("{'str1','str2','str3'}.get(1)",context,context.getRoot());
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		System.out.println("********************");
		Integer value4 = (Integer) Ognl.getValue("#{'name':'dwg1','age':25,'str3':'dwg3'}.size()",context,context.getRoot());
		Integer value5= (Integer) Ognl.getValue("#{'name':'dwg1','age':25,'str3':'dwg3'}['age']",context,context.getRoot());
		String value6 = (String) Ognl.getValue("#{'name':'dwg1','age':25,'str3':'dwg3'}.get('name')",context,context.getRoot());
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		
	}
	
	
	@Test
	public void fun1() throws OgnlException{
//		OgnlContext context = new OgnlContext();
//		Object value = Ognl.getValue("'hello world'.length()", context, context.getRoot());
//		System.out.println(value);
		OgnlContext context = new OgnlContext();
		
		User rootUser = new User();
		rootUser.setName("hello");
		rootUser.setAge(22);
		
		Map<String, User> map = new HashMap<>();
		map.put("user1", new User("dwg1",33));
		map.put("user2", new User("dwg2",43));
		
		context.setRoot(rootUser); 
		context.setValues(map);
		
		String value = (String) Ognl.getValue("name",context,context.getRoot());
		Integer age = (Integer) Ognl.getValue("#age",context,context.getRoot());
		System.out.println(value);
		System.out.println(age);
		System.out.println("*****************************");
		
		User user1 = (User) Ognl.getValue("#user1",context,context.getRoot());
		System.out.println(user1);
		
		String name = (String) Ognl.getValue("#user2.name",context,context.getRoot());
		System.out.println(name);
	}
	
	
}
