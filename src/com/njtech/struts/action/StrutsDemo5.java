package com.njtech.struts.action;


import org.apache.struts2.ServletActionContext;
import org.junit.Test;

import com.njtech.struts.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.util.CompoundRoot;
import com.opensymphony.xwork2.util.ValueStack;

import ognl.OgnlContext;

public class StrutsDemo5 extends ActionSupport implements Preparable{
	private String post;
	private String name="lw";
	private String testStr="haha";
	
	
	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}
	@Override
	public String toString() {
		return "StrutsDemo5∂‘œÛ:"+name+" " +post;
	}

	@Override
	public String execute() throws Exception {
		setName("lw");
		setPost("student");
		ValueStack stack = ActionContext.getContext().getValueStack();
		CompoundRoot root = ActionContext.getContext().getValueStack().getRoot();
		System.out.println(root.size());
		for (Object object : root) {
			System.out.println(object);
		}
		System.out.println("*************************");
		
//		OgnlContext ctx = new OgnlContext();
		
		ActionContext.getContext().put("post", "Programer");
		System.out.println(ActionContext.getContext().get("post"));;
		System.out.println(ActionContext.getContext().get("post"));;
//		System.out.println(stack.findString("${#request.name}"));
//		ValueStack stack = ActionContext.getContext().getValueStack();
////		stack.getContext().put("testStr", "hello,world");
//		
//		ActionContext.getContext().put("testStrInRequest","hello,request");
//		ActionContext.getContext().getSession().put("testStrInSession","hello,session");
//		ActionContext.getContext().getApplication().put("testStrInApplication","hello,Application");
//		
//		System.out.println(stack.findString("testStr"));
		return SUCCESS;
	}
	
	public String getRequest(){
		return SUCCESS;
	}

	@Override
	public void prepare() throws Exception {
		ValueStack stack = ActionContext.getContext().getValueStack();
		User user = new User("dwg",33);
		stack.push(user );
		User user1 = new User("dwg1",35);
		stack.push(user1 );
	}
	
}
