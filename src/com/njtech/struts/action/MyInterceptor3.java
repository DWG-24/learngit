package com.njtech.struts.action;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor3 extends AbstractInterceptor /*implements Interceptor*/{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("ִ����MyInterceptor3��intercept()������");
		return invocation.invoke();
	}

}
