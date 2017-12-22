package com.njtech.struts.action;


import java.util.List;
import java.util.Map;

import com.njtech.struts.bean.User;
import com.opensymphony.xwork2.ActionSupport;

public class StrutsDemo4 extends ActionSupport {
	private List<String> list;
	private Map<String, User> map;
	
	
	public Map<String, User> getMap() {
		return map;
	}


	public void setMap(Map<String, User> map) {
		this.map = map;
	}


	public List<String> getList() {
		return list;
	}


	public void setList(List<String> list) {
		this.list = list;
	}


	public StrutsDemo4() {
		super();
		System.out.println("生成StrutsDemo4新对象");
	}

	
	public String register(){
		
		for (String key : map.keySet()) {
			System.out.println(map.get(key));
		}
		return SUCCESS;
	}
	
	public static void test(){
		System.out.println("执行StrutsDemo4.test()");
	}
	
}
