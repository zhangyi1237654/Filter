package com.imooc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstFilter implements Filter {

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("Start......doFilter.....FirstFilter");
		arg2.doFilter(arg0, arg1);
		System.out.println("End......doFilter......FirstFilter");
	}

	@Override
	public void destroy() {
		System.out.println("destroy......FirstFilter");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init......FirstFilter");
	}

}
