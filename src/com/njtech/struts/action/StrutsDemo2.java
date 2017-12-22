package com.njtech.struts.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class StrutsDemo2 extends ActionSupport implements ServletRequestAware{
	private HttpServletRequest request;
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	public String execute(){
		System.out.println("StrutsDemo2.execute()");
		return NONE;
	}
	public String save(){
		System.out.println("execute save()");
		return NONE;
	}
}
