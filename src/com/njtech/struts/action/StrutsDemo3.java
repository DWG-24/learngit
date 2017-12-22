package com.njtech.struts.action;


import com.njtech.struts.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.util.ValueStack;

public class StrutsDemo3 extends ActionSupport implements ModelDriven<User>{
	private User user = new User();
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public StrutsDemo3() {
		super();
		System.out.println("生成StrutsDemo3新对象");
	}
	
	public String execute(){
		
		System.out.println(user);
		return NONE;
	}
	
	public String register(){
		System.out.println(user);
		return SUCCESS;
	}


	@Override
	public User getModel() {
		return user;
	}
}
