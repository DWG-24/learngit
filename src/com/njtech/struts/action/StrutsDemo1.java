package com.njtech.struts.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class StrutsDemo1 extends ActionSupport{
	public String execute(){
		System.out.println("StructsDemo1.execute()");
		return SUCCESS;
	}
	public String save(){
		System.out.println("execute save()");
		return NONE;
	}
	public String toAction(){
		System.out.println("execute toAction()");
		return "toAction";
	}
	
	public String test(){
		Map<String, Object> session = ActionContext.getContext().getSession();
		Map<String, Object> application = ActionContext.getContext().getApplication();
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session2 = request.getSession();
		
		HttpServletResponse response = ServletActionContext.getResponse();
		ServletContext servletContext = ServletActionContext.getServletContext();
		
		return NONE;
	}
}
