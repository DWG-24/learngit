package com.njtech.struts.bean;

import java.util.Date;

public class User {
	public User(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	public User() {
		super();
	}

	private String name;
	private Integer age;
	private Date birthday;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "User����:"+ name+"  "+age+" " + birthday;
	}
}
