package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstProgram implements Servlet{

	@Override
	public void destroy() {
		System.out.println("destroy method called");
		
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method called");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service method called");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("welcome to servlet");
		out.println("date is "+ new Date().toString());
		
	}
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
