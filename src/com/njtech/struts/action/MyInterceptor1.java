package com.njtech.struts.action;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor1 extends AbstractInterceptor /*implements Interceptor*/{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("ִ����MyInterceptor1��intercept()������");
		return invocation.invoke();
	}

}
